import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HotelTest {
    @Test
    public void testHotelRoomFiltering_AAA() {
        // Arrange
        Hotel hotel = new Hotel("Palace");
        Room r1 = new Room(101);
        r1.setRoomType(new RoomType(RoomKind.SINGLE, new Money(100)));
        hotel.addRoom(r1);

        // Act
        List<Room> available = hotel.available();

        // Assert
        assertEquals(1, available.size());
        assertEquals(101, available.get(0).getNumber());
    }
}