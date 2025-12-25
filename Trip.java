public abstract class Trip {
    private String tripCode;
    private String title;
    private double basePrice;

    public Trip(String tripCode, String title, double basePrice) {
        this.tripCode = tripCode;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getTripCode(){
        return tripCode;
    }
    public String getTitle(){
        return title;
    }
    public double getBasePrice(){
        return basePrice;
    }

    public abstract double calculatePrice();
}
