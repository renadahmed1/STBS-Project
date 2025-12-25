import java.util.ArrayList;
import java.util.List;
public class Booking {
    private List<Trip> trips = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addTrip(Trip t) {
        trips.add(t);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(){
        double total = 0;
        for (Trip t : trips) {
            total += t.calculatePrice();
            // total = 0 + 700 = 700
            // total = 700 + 4500 = 5200

        }
        return total; // 5200
    }

    public double calculateFinalTotal() {
        double total = calculateTotal(); // 5200
        if (discountStrategy != null) {
            return discountStrategy.apply(total); // 5200 - ( 5200 * 0.1)
        }
        return total;
    }
}
