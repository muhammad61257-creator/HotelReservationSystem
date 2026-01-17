import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTest {
    @Test
    public void testRoomOccupancy_AAA() {
        // Arrange
        Room room = new Room(101);
        Address addr = new Address("Main St", "Karachi");
        
        // Act
        room.createGuest("Saad", addr);
        
        // Assert
        assertNotNull(room.getOccupant());
        assertEquals("Saad", room.getOccupant().getName());
    }
}