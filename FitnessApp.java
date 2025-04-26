
public class FitnessApp {
    public static void main(String[] args) {
        User user = new User("Ali", 25);

        Activity running = new Running("Morning Run", 30, 250, 5);
        Activity cycling = new Cycling("Evening Cycling", 45, 400, 20);
        Activity workout = new Workout("Gym Workout", 60, 500, 8);

        user.addActivity(running);
        user.addActivity(cycling);
        user.addActivity(workout);

        System.out.println("Activities for " + user.name + ":");
        for (Activity a : user.getActivities()) {
            System.out.println(a.getInfo());
        }

        System.out.println("Total Duration: " + user.calculateTotalDuration() + " minutes");

        ActivityProcessor processor = new ActivityProcessor(user);
        processor.start();
    }
}
