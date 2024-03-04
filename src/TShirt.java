public class TShirt extends Clothing {
    private String sleeves;
    private String neck;
    private String price;
    private ClothingCommand decorationCommand;


    public TShirt() {
        super();
    }

    public TShirt(String size, String material, String color, String sleeves, String neck, String price) {
        super(size, material, color);
        this.sleeves = sleeves;
        this.neck = neck;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSleeves(   ) {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }


    public void setDecorationCommand(ClothingCommand command) {
        this.decorationCommand = command;
    }

    public void decorate() {
        if (decorationCommand != null) {
            decorationCommand.execute();
        } else {
            System.out.println("No decoration command set for this T-shirt.");
        }
    }
}
