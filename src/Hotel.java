import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    // FIX: Change this to only take ONE argument: Room
    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Cannot add a null room."); // Defensive Programming
        }
        this.rooms.add(room);
    }

    public List<Room> available() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public String getName() { return name; }
}