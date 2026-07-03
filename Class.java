public class Class {
    public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}

public interface NotificationChannel {
    void send(String recipient, String message);
}
Then each channel implements it:
public class SmsChannel implements NotificationChannel {
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
public class EmailChannel implements NotificationChannel {
    public void send(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}

}