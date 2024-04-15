public class TShirtBuilder {
    public TShirt buildTShirt(String size, String material, String color) {
        return TShirt.Builder()
                .size(size)
                .material(material)
                .color(color)
                .price("300 kr")
                .build();
    }
}
