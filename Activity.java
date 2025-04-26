
public class Activity {
    protected String name;
    protected double duration;
    protected double calories;

    public Activity(String name, double duration, double calories) {
        this.name = name;
        this.duration = duration;
        this.calories = calories;
    }

    public String getInfo() {
        return "Activity: " + name + ", Duration: " + duration + " mins, Calories: " + calories;
    }

    public double getDuration() {
        return duration;
    }

    public double getCalories() {
        return calories;
    }
}
