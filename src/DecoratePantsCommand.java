public class DecoratePantsCommand implements ClothingCommand {
    private String color;
    private String fit;
    private String length;
    private Pants pants;

    public DecoratePantsCommand(Pants pants, String color, String fit, String length) {
        this.pants = pants;
        this.color = color;
        this.fit = fit;
        this.length = length;
    }

    @Override
    public void execute() {
        pants.setColor(color);
        pants.fit();
        pants.Length(length);
        System.out.println("Decorated Pants with fit: " +  fit + ", length: " + length + "cm" + "and color:" + color);
    }
}
