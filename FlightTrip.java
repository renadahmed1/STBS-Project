public class FlightTrip extends Trip {
    private String airline;
    private double distance; 

    public FlightTrip(String tripCode, String title, double basePrice,  String airline, double distance) {
        super(tripCode, title, basePrice);
        setAirline(airline);
        setDistance(distance);
    }
    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        if (airline != null && !airline.isEmpty()) {
            this.airline = airline;
        }
    }

    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        if (distance > 0) {
            this.distance = distance;
        }
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + (distance * 0.5);
    }
}
