import java.util.Scanner;

public class WebShop {

    public static void main(String[] args) {
        CEO ceo = new CEO("Wigells CEO");





        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();


        System.out.println("Welcome to the Shop!");

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        customer.setName(name);

        System.out.println("Please enter your address:");
        String adress = scanner.nextLine();
        customer.setAddress(adress);

        System.out.println("Please enter your email:");
        String email = scanner.nextLine();
        customer.setEmail(email);



        boolean exit = false;
        while (!exit) {

            System.out.println("Welcome to the Garment Shop!");

            System.out.println("Select a garment to buy:");
            System.out.println("1. Pants");
            System.out.println("2. Skirt");
            System.out.println("3. T-Shirt");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    buyPants(scanner, ceo, customer);
                    break;
                case 2:
                    buySkirt(scanner, ceo, customer);
                    break;

                case 3:
                    buyTShirt(scanner, ceo, customer);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for visiting the Shop!");
    }
    public static void buyTShirt(Scanner scanner, CEO ceo, Customer customer) {


        System.out.println("You've selected TShirt.");



        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();



        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();


        System.out.print("Enter color (blue, green, yellow): ");
        String color = scanner.nextLine();



        System.out.print("Enter slevelength in cm (15, 20, 30): ");
        String sleeves = scanner.nextLine();


        System.out.print("Enter neck type (round, v-neck, square): ");
        String neck = scanner.nextLine();



        TShirtDirector director = new TShirtDirector();
        TShirt tShirt = director.constructTShirt(size, material, color, sleeves, neck);







        System.out.println("You've bought a Tshirt for " + tShirt.getPrice() + " with:");
        System.out.println("Size: " + tShirt.getSize());
        System.out.println("Material: " + tShirt.getMaterial());
        System.out.println("Color: " + tShirt.getColor());


        ClothingCommand addDecorationCommand = new DecorateTShirtCommand(tShirt, color, sleeves, neck);
        tShirt.setDecorationCommandTshirt(addDecorationCommand);


        System.out.println("\n");
        ceo.update("T-Shirt tillverkas.");

        tShirt.decorate();

        System.out.println("\n");
        ceo.update("T-Shirt klar.");


    }
    public static void buyPants(Scanner scanner, CEO ceo, Customer customer) {


        System.out.println("You've selected Pants.");

        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();

        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();

        System.out.print("Enter color (red, blue, green): ");
        String color = scanner.nextLine();

        System.out.println("Enter fit (regular, skinny, tapered): ");
        String fit = scanner.nextLine();

        System.out.println("Enter desired length of pants in cm: ");
        String length = scanner.nextLine();

        PantsDirector director = new PantsDirector();
        Pants pants = director.constructPants(size, material, color, fit, length);

        System.out.println("You've bought Pants for " + pants.getPrice() + " with:");
        System.out.println("Size: " + pants.getSize());
        System.out.println("Material: " + pants.getMaterial());
        System.out.println("Color: " + pants.getColor());
        System.out.println("Thank you " + customer.getName() + " for your purchase! The pants will be sent to " + customer.getAddress() + ".");

        ClothingCommand addDecorationCommand = new DecoratePantsCommand(pants, color, fit, length);
        pants.setDecorationCommandPants(addDecorationCommand);

        System.out.println("\n");

        ceo.update("Pants tillverkas.");
        pants.decorate();

        System.out.println("\n");
        ceo.update("Pants klar.");

        System.out.println("\n");
    }

    public static void buySkirt(Scanner scanner, CEO ceo, Customer customer) {






        System.out.println("You've selected Skirt.");



        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();


        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();



        System.out.println("Enter skirt color (blue, green, yellow): ");
        String color = scanner.nextLine();


        System.out.println("Enter skirt waistline in cm (65, 72, 82): ");
        String waistline = scanner.nextLine();


        System.out.println("Enter skirt pattern (striped, uniform, wavy): ");
        String pattern = scanner.nextLine();




        SkirtDirector director = new SkirtDirector();
        Skirt skirt = director.constructSkirt(size, material, color, waistline, pattern);

        ClothingCommand addPatternCommand = new DecorateSkirtCommand(skirt, pattern, waistline);
        skirt.setDecorationCommandSkirt(addPatternCommand);


        System.out.println("You've bought Skirt for " + skirt.getPrice() + " with:");
        System.out.println("Size: " + skirt.getSize());
        System.out.println("Material: " + skirt.getMaterial());
        System.out.println("Color: " + skirt.getColor());
        System.out.println("Thank you " + customer.getName() + "for your purchase! The skirt will be sent to " + customer.getAddress() + ".");

        ceo.update("Skirt tillverkas.");

        skirt.decorate();

        System.out.println("\n");

        ceo.update("Skirt klar.");

        System.out.println("\n");
    }
}



