public class RoomType {
    private final RoomKind kind;
    private final Money cost;

    public RoomType(RoomKind kind, Money cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public RoomKind getKind() { return kind; }
    public Money getCost() { return cost; }
}