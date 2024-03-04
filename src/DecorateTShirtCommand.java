public class DecorateTShirtCommand implements ClothingCommand {
    private String color;
    private String sleeves;
    private String neck;
    private TShirt tShirt;

    public DecorateTShirtCommand(TShirt tShirt, String color, String sleeves, String neck) {
        this.tShirt = tShirt;
        this.color = color;
        this.sleeves = sleeves;
        this.neck = neck;
    }

    @Override
    public void execute() {
        tShirt.setColor(color);
        tShirt.setSleeves(sleeves);
        tShirt.setNeck(neck);
        System.out.println("Decorated T-Shirt with sleeves: " + sleeves + "and neck: " + neck);
    }
}
