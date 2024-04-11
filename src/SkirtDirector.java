public class SkirtDirector {
    public Skirt constructSkirt(String size, String material, String color, String waistline, String pattern) {
        return Skirt.Builder()
                .size(size)
                .material(material)
                .color(color)
                .waistline(waistline)
                .pattern(pattern)
                .price("150 kr")
                .build();
    }
}
