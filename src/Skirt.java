public class Skirt extends Clothing {

    private ClothingCommand decorationCommand;
    private String waistline;
    private String pattern;
    private String price;

    public void setDecorationCommandSkirt(ClothingCommand command) {
        this.decorationCommand = command;
    }

    private Skirt(SkirtBuilder builder) {
        super(builder.size, builder.material, builder.color);
        this.waistline = builder.waistline;
        this.pattern = builder.pattern;
        this.price = builder.price;
    }

    public static SkirtBuilder Builder() {
        return new SkirtBuilder();
    }

    @Override
    public void decorate() {
            decorationCommand.execute();
    }



    public String getPrice() {
        return price;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public static class SkirtBuilder {
        private String size;
        private String material;
        private String color;
        private String waistline;
        private String pattern;
        private String price;

        public SkirtBuilder size(String size) {
            this.size = size;
            return this;
        }

        public SkirtBuilder material(String material) {
            this.material = material;
            return this;
        }

        public SkirtBuilder color(String color) {
            this.color = color;
            return this;
        }

        public SkirtBuilder waistline(String waistline) {
            this.waistline = waistline;
            return this;
        }

        public SkirtBuilder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        public SkirtBuilder price(String price) {
            this.price = price;
            return this;
        }

        public Skirt build() {
            return new Skirt(this);
        }


    }

}
