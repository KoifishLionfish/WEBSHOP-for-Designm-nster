public class CEO implements CEOobserver {
    private String name;

    public CEO(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
