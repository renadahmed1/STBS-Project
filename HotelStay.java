public class HotelStay extends Trip {
    private int nights;
    private double pricePerNight;

    public HotelStay(String tripCode, String title, double basePrice, int nights, double pricePerNight) {
        super(tripCode, title, basePrice);
        setNights(nights);
        setPricePerNight(pricePerNight);
    }

    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        if (nights > 0) {
            this.nights = nights;
        }
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
        }
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + (nights * pricePerNight);
    }
}
