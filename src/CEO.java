public class CEO implements Observer {
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}