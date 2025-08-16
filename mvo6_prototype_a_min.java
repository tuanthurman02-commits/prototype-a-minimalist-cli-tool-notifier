import java.util.ArrayList;
import java.util.List;

public class MVO6_Prototype_A_Min {
    private static class Notification {
        private String message;
        private int priority;

        public Notification(String message, int priority) {
            this.message = message;
            this.priority = priority;
        }

        public String getMessage() {
            return message;
        }

        public int getPriority() {
            return priority;
        }
    }

    private List<Notification> notifications;

    public MVO6_Prototype_A_Min() {
        this.notifications = new ArrayList<>();
    }

    public void notify(String message, int priority) {
        notifications.add(new Notification(message, priority));
    }

    public void printNotifications() {
        notifications.sort((n1, n2) -> Integer.compare(n2.getPriority(), n1.getPriority()));
        for (Notification notification : notifications) {
            System.out.println("[" + notification.getPriority() + "] " + notification.getMessage());
        }
    }

    public static void main(String[] args) {
        MVO6_Prototype_A_Min notifier = new MVO6_Prototype_A_Min();
        notifier.notify("Low priority message", 1);
        notifier.notify("High priority message", 3);
        notifier.notify("Medium priority message", 2);
        notifier.printNotifications();
    }
}