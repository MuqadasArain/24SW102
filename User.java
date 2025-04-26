

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int age;
    private List<Activity> activities;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public double calculateTotalDuration() {
        double total = 0;
        for (Activity a : activities) {
            total += a.getDuration();
        }
        return total;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
