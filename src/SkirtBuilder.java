public class SkirtBuilder {
    public Skirt buildSkirt(String size, String material, String color) {
        return Skirt.Builder()
                .size(size)
                .material(material)
                .price("150 kr")
                .build();
    }
}
