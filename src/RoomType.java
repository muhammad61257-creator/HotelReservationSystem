public class RoomType {
    private RoomKind kind;
    private Money price;

    public RoomType(RoomKind kind, Money price) {
        if (kind == null || price == null) {
            throw new IllegalArgumentException("RoomKind and Price cannot be null.");
        }
        this.kind = kind;
        this.price = price;
    }

    // Add this to fix the test error
    public Money getPrice() {
        return price;
    }

    // Add this to support full testing
    public RoomKind getKind() {
        return kind;
    }
}