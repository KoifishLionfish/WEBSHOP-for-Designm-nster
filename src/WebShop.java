import java.util.Scanner;

public class WebShop {

    public static void main(String[] args) {
        CEO ceo = new CEO("Wigells CEO");
        Pants pants = new Pants();
        TShirt tShirt = new TShirt();
        Skirt skirt = new Skirt();

        skirt.setPrice("150 kr");
        tShirt.setPrice("100 kr");
        pants.setPrice("200 kr");



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

        TShirt tShirt = new TShirt();
        tShirt.setPrice("100 kr");




        System.out.println("You've selected TShirt.");



        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();
        tShirt.setSize(size);


        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();
        tShirt.setMaterial(material);

        System.out.print("Enter color (blue, green, yellow): ");
        String color = scanner.nextLine();
        tShirt.setColor(color);


        System.out.print("Enter slevelength in cm (15, 20, 30): ");
        String sleeves = scanner.nextLine();
        tShirt.setSleeves(sleeves);

        System.out.print("Enter neck type (round, v-neck, square): ");
        String neck = scanner.nextLine();
        tShirt.setNeck(neck);








        System.out.println("You've bought a Tshirt for " + tShirt.getPrice() + " with:");
        System.out.println("Size: " + tShirt.getSize());
        System.out.println("Material: " + tShirt.getMaterial());
        System.out.println("Color: " + tShirt.getColor());


        ClothingCommand addDecorationCommand = new DecorateTShirtCommand(tShirt, color, sleeves, neck);
        tShirt.setDecorationCommand(addDecorationCommand);


        System.out.println("\n");
        ceo.update("T-Shirt tillverkas.");

        tShirt.decorate();

        System.out.println("\n");
        ceo.update("T-Shirt klar.");


    }
    public static void buyPants(Scanner scanner, CEO ceo, Customer customer) {


        Pants pants = new Pants();
        pants.setPrice("200 kr");

        System.out.println("You've selected Pants.");



        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();
        pants.setSize(size);

        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();
        pants.setMaterial(material);

        System.out.print("Enter color (red, blue, green): ");
        String color = scanner.nextLine();
        pants.setColor(material);

        System.out.println("Enter fit (regular, skinny, tapered: ");
        String fit = scanner.nextLine();
        pants.setFit(fit);

        System.out.println("Enter desired length of pants in cm: ");
        String length = scanner.nextLine();
        pants.setLength(length);


        System.out.println("You've bought Pants for " + pants.getPrice() + " with:");
        System.out.println("Size: " + pants.getSize());
        System.out.println("Material: " + pants.getMaterial());
        System.out.println("Color: " + pants.getColor());
        System.out.println("Thank you " + customer.getName() + " for your purchase! The pants will be sent to " + customer.getAddress() + ".");

        ClothingCommand addDecorationCommand = new DecoratePantsCommand(pants, color, fit, length);
        pants.setDecorationCommand(addDecorationCommand);

        System.out.println("\n");

        ceo.update("Pants tillverkas.");
        pants.decorate();

        System.out.println("\n");
        ceo.update("Pants klar.");


        System.out.println("\n");

    }

    public static void buySkirt(Scanner scanner, CEO ceo, Customer customer) {

        Skirt skirt = new Skirt();
        skirt.setPrice("150 kr");




        System.out.println("You've selected Skirt.");



        System.out.print("Enter size (M, L): ");
        String size = scanner.nextLine();
        skirt.setSize(size);

        System.out.print("Enter material (cotton, wool): ");
        String material = scanner.nextLine();
        skirt.setMaterial(material);


        System.out.println("Enter skirt color (blue, green, yellow): ");
        String color = scanner.nextLine();
        skirt.setColor(color);

        System.out.println("Enter skirt waistline in cm (65, 72, 82): ");
        String waistline = scanner.nextLine();
        skirt.setWaistline(waistline);

        System.out.println("Enter skirt pattern (striped, uniform, wavy): ");
        String pattern = scanner.nextLine();
        skirt.setPattern(pattern);


        ClothingCommand addPatternCommand = new DecorateSkirtCommand(skirt, pattern, waistline);

        skirt.setDecorationCommand(addPatternCommand);


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



