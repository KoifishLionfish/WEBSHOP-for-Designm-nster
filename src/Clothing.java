public abstract class Clothing {
    private String size;
    private String material;
    private String color;




    public Clothing(String size, String material, String color) {
        this.size = size;
        this.material = material;
        this.color = color;

    }




    public String getSize() {
        return size;
    }


    public String getMaterial() {
        return material;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void decorate();
}
