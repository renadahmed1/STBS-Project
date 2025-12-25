public class TourTrip extends Trip {
    private int duration;
    private double dailyGuideFee;

    public TourTrip(String tripCode, String title, double basePrice, int duration, double dailyGuideFee) {
        super(tripCode, title, basePrice);
        setDuration(duration);
        setDailyGuideFee(dailyGuideFee);
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }

    public double getDailyGuideFee() {
        return dailyGuideFee;
    }
    public void setDailyGuideFee(double dailyGuideFee) {
        if (dailyGuideFee > 0) {
            this.dailyGuideFee = dailyGuideFee;
        }
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + (duration * dailyGuideFee);
    }
}
