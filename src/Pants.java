public class Pants extends Clothing {
    private String fit;
    private String length;
    private String price;
    private ClothingCommand decorationCommand;

    // Constructors
    public Pants() {
        super();
    }

    public Pants(String size, String material, String color, String fit, String length, String price) {
        super(size, material, color);
        this.fit = fit;
        this.length = length;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }


    public void setDecorationCommand(ClothingCommand command) {
        this.decorationCommand = command;
    }

    public void decorate() {
        if (decorationCommand != null) {
            decorationCommand.execute();
        } else {
            System.out.println("No decoration command set for these pants.");
        }
    }
}
