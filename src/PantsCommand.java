public class PantsCommand implements ClothingCommand {
    private String color;
    private String fit;
    private String length;
    private Pants pants;

    public PantsCommand(Pants pants, String fit, String length) {
        this.pants = pants;

        this.fit = fit;
        this.length = length;
    }

    @Override
    public void execute() {

        pants.fit();
        pants.Length(length);
        System.out.println("Decorated Pants with fit: " +  fit + " and length: " + length + "cm");
    }
}
