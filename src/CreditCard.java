public class CreditCard {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        // Defensive Programming: Validate input [cite: 25]
        if (cardNumber == null || cardNumber.length() < 16) {
            throw new IllegalArgumentException("Invalid credit card number.");
        }
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}