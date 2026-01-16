public class ReserverPayer {
    private Identity identity;
    private CreditCard creditCard;

    public ReserverPayer(Identity identity, CreditCard creditCard) {
        if (identity == null || creditCard == null) {
            throw new IllegalArgumentException("Identity and CreditCard cannot be null");
        }
        this.identity = identity;
        this.creditCard = creditCard;
    }

    public Identity getIdentity() {
        return identity;
    }

    // Adding this getter removes the "not used" warning
    public CreditCard getCreditCard() {
        return creditCard;
    }
}