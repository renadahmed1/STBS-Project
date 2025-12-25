public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total;
    }
}
