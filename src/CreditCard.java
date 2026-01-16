public class CreditCard {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        // WP7: Defensive Programming - Validate card length
        if (cardNumber == null || cardNumber.length() < 16) {
            throw new IllegalArgumentException("Invalid credit card: Must be 16 digits.");
        }
        this.cardNumber = cardNumber;
    }

    // Adding this "Getter" tells Java the field IS being used
    public String getCardNumber() {
        return cardNumber;
    }
}