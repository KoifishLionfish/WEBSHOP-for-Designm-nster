public class Skirt extends Clothing {

    private ClothingCommand decorationCommand;
    private String waistline;
    private String pattern;
    private String price;

    public void setDecorationCommand(ClothingCommand command) {
        this.decorationCommand = command;
    }


    public Skirt() {
        super();
    }

    public Skirt(String size, String material, String color, String waistline, String pattern, String price) {
        super(size, material, color);
        this.waistline = waistline;
        this.pattern = pattern;
        this.price = price;

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void decorate() {
        if (decorationCommand != null) {
            decorationCommand.execute();
        } else {
            System.out.println("No decoration command set for this skirt.");
        }
    }
}
