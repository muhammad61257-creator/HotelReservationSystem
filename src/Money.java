public class Money {
    private final double amount; // Use primitive double for simplicity

    public Money(double amount) {
        // WP7: Defensive Programming - Prevent negative money
        if (amount < 0) {
            throw new IllegalArgumentException("Money amount cannot be negative.");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}