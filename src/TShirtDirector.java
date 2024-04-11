public class TShirtDirector {
    public TShirt constructTShirt(String size, String material, String color, String sleeves, String neck) {
        return TShirt.Builder()
                .size(size)
                .material(material)
                .color(color)
                .sleeves(sleeves)
                .neck(neck)
                .price("300 kr")
                .build();
    }
}
