public class PercentageDiscount implements DiscountStrategy {
    private double percentage; 

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double total) {
        return total - (total * percentage / 100);
    }
}
