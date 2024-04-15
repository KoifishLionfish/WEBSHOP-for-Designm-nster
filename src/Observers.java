public class Observers implements Observer {
    private String name;

    public Observers(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
