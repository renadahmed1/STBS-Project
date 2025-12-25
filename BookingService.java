public class BookingService {
    private Payable paymentMethod;
    private NotificationChannel notificationChannel;

    public BookingService(Payable paymentMethod,  NotificationChannel notificationChannel) {
        this.paymentMethod = paymentMethod;
        this.notificationChannel = notificationChannel;
    }

    public void processBooking(Booking booking) {
        double finalAmount = booking.calculateFinalTotal();
        paymentMethod.pay(finalAmount);
        notificationChannel.send("Booking confirmed. \nTotal = " + finalAmount);
    }
}
