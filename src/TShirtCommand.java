public class TShirtCommand implements ClothingCommand {

    private String sleeves;
    private String neck;
    private TShirt tShirt;

    public TShirtCommand(TShirt tShirt, String sleeves, String neck) {
        this.tShirt = tShirt;

        this.sleeves = sleeves;
        this.neck = neck;
    }

    @Override
    public void execute() {

        tShirt.setSleeves(sleeves);
        tShirt.setNeck(neck);
        System.out.println("Decorated T-Shirt with sleeves: " + sleeves + "and neck: " + neck);
    }
}
