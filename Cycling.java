
public class Cycling extends Activity {
    private double speed;

    public Cycling(String name, double duration, double calories, double speed) {
        super(name, duration, calories);
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Speed: " + speed + " km/h";
    }
}
