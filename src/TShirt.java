public class TShirt extends Clothing {
    private String sleeves;
    private String neck;
    private String price;
    private ClothingCommand decorationCommand;



    private TShirt(TShirtBuilder builder) {
        super(builder.size, builder.material, builder.color);
        this.sleeves = builder.sleeves;
        this.neck = builder.neck;
        this.price = builder.price;
    }

    public static TShirtBuilder Builder() {
        return new TShirtBuilder();
    }

    @Override
    public void decorate() {
            decorationCommand.execute();
    }

    public void setDecorationCommandTshirt(ClothingCommand addDecorationCommand) {
        this.decorationCommand = addDecorationCommand;
    }

    public String getPrice() {
        return price;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public static class TShirtBuilder {
        private String size;
        private String material;
        private String color;
        private String sleeves;
        private String neck;
        private String price;

        public TShirtBuilder size(String size) {
            this.size = size;
            return this;
        }

        public TShirtBuilder material(String material) {
            this.material = material;
            return this;
        }

        public TShirtBuilder color(String color) {
            this.color = color;
            return this;
        }

        public TShirtBuilder sleeves(String sleeves) {
            this.sleeves = sleeves;
            return this;
        }

        public TShirtBuilder neck(String neck) {
            this.neck = neck;
            return this;
        }

        public TShirtBuilder price(String price) {
            this.price = price;
            return this;
        }

        public TShirt build() {
            return new TShirt(this);
        }
    }

}
