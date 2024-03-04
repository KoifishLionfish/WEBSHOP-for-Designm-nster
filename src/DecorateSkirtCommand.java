public class DecorateSkirtCommand implements ClothingCommand {
    private String pattern;
    private String waistline;
    private Skirt skirt;

    public DecorateSkirtCommand(Skirt skirt, String pattern, String waistline) {
        this.skirt = skirt;
        this.pattern = pattern;
        this.waistline = waistline;
    }

    @Override
    public void execute() {
        skirt.setPattern(pattern);
        skirt.setWaistline(waistline);
        System.out.println("Decorated with pattern: " + pattern + " and waistline: " + waistline + "cm.");
    }
}
