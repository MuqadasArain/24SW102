
public class Workout extends Activity {
    private double exercise;

    public Workout(String name, double duration, double calories, double exercise) {
        super(name, duration, calories);
        this.exercise = exercise;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Exercise Intensity: " + exercise;
    }
}
