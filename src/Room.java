public class Room {
    private final Integer number;
    private RoomType roomType;
    private Guest occupant; // Association: 0..1 occupied 

    public Room(Integer number) {
        // Defensive: Ensure room number is valid [cite: 25]
        if (number <= 0) throw new IllegalArgumentException("Room number must be positive");
        this.number = number;
    }

    // This method links the Room to its RoomType 
    public void setRoomType(RoomType type) {
        if (type == null) throw new IllegalArgumentException("RoomType cannot be null");
        this.roomType = type;
    }

    public void createGuest(String name, Address addr) {
        // Defensive programming: prevent illegal states [cite: 26, 28]
        if (this.occupant != null) throw new IllegalStateException("Room already occupied");
        this.occupant = new Guest(name, addr); 
    }

    public void checkout() {
        this.occupant = null; // Clears the association 
    }

    public boolean isAvailable() {
        return occupant == null;
    }

    public Guest getOccupant() { return occupant; }
    public RoomType getRoomType() { return roomType; }
    public Integer getNumber() { return number; }
}