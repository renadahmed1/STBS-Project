public class Main {
    public static void main(String[] args) {

        Trip f = new FlightTrip("F015", "Cairo to Dubai", 3500, "ElMasrya", 4200);
        Trip h = new HotelStay("H0001", "5 Star Hotel", 800, 3, 650);
        Trip t = new TourTrip("T001", "City Tour", 300, 2, 400);

        Booking booking = new Booking();
        booking.addTrip(f);
        booking.addTrip(h);
        booking.addTrip(t);

        booking.setDiscountStrategy(new PercentageDiscount(15));

        Payable payment = new CreditCardPayment();
        NotificationChannel notification = new EmailNotification();

        BookingService service = new BookingService(payment, notification);

        service.processBooking(booking);
    }
}
