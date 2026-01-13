public class Money {
    private double amount;

    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative."); // [cite: 25, 27]
        }
        this.amount = amount;
    }

    public double getAmount() { return amount; }
}