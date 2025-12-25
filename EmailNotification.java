public class EmailNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
