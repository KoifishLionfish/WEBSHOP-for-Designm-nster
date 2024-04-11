public class PantsDirector {
    public Pants constructPants(String size, String material, String color, String fit, String length) {
        return Pants.Builder()
                .size(size)
                .material(material)
                .color(color)
                .fit(fit)
                .length(length)
                .price("200 kr")
                .build();
    }
}
