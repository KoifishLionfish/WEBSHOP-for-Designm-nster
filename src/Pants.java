public class Pants extends Clothing {
    private String fit;
    private String length;
    private String price;
    private ClothingCommand decorationCommand;

    public void setDecorationCommandPants(ClothingCommand command) {
        this.decorationCommand = command;
    }

    private Pants(PantsBuilder builder) {
        super(builder.size, builder.material, builder.color);
        this.fit = builder.fit;
        this.length = builder.length;
        this.price = builder.price;
    }

    public static PantsBuilder Builder() {
        return new PantsBuilder();
    }

    @Override
    public void decorate() {
            decorationCommand.execute();
    }

    public String getPrice() {
        return price;

    }

    public void Length(String length) {
    }

    public String fit(){
        return fit;
    }

    public static class PantsBuilder {
        private String size;
        private String material;
        private String color;
        private String fit;
        private String length;
        private String price;

        public PantsBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PantsBuilder material(String material) {
            this.material = material;
            return this;
        }

        public PantsBuilder color(String color) {
            this.color = color;
            return this;
        }

        public PantsBuilder fit(String fit) {
            this.fit = fit;
            return this;
        }

        public PantsBuilder length(String length) {
            this.length = length;
            return this;
        }

        public PantsBuilder price(String price) {
            this.price = price;
            return this;
        }


        public Pants build() {
            return new Pants(this);
        }
    }
}
