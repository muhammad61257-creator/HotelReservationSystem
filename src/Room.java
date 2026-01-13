public class Room {
    private int number;
    private Guest occupied; // Points to the Guest currently in the room 

    public Room(int number) {
        this.number = number;
    }

    public void createGuest(String name, Address address) {
        this.occupied = new Guest(name, address); // [cite: 66]
    }

    public boolean isAvailable() {
        return occupied == null;
    }
}