public class RoomType {
    private String kind; // e.g., "Deluxe", "Single"
    private Money cost;

    public RoomType(String kind, Money cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public Money getCost() { return cost; }
}