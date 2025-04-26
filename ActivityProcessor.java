
public class ActivityProcessor extends Thread {
    private User user;

    public ActivityProcessor(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        process(user);
    }

    public void process(User user) {
        System.out.println("Processing activities in background thread...");
        for (Activity a : user.getActivities()) {
            System.out.println("Processed: " + a.getInfo());
        }
    }
}
