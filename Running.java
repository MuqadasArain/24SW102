
public class Running extends Activity {
    private double distance;

    public Running(String name, double duration, double calories, double distance) {
        super(name, duration, calories);
        this.distance = distance;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Distance: " + distance + " km";
    }
}
