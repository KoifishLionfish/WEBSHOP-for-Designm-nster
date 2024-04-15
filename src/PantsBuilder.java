public class PantsBuilder {
    public Pants buildPants(String size, String material, String color) {
        return Pants.Builder()
                .size(size)
                .material(material)
                .color(color)

                .price("200 kr")
                .build();
    }
}
