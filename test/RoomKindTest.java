import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomKindTest {

    @Test
    public void testEnumConstants_AAA() {
        // Arrange & Act
        RoomKind single = RoomKind.SINGLE;
        RoomKind doubleRoom = RoomKind.DOUBLE;
        RoomKind deluxe = RoomKind.DELUXE;

        // Assert
        assertEquals("SINGLE", single.name());
        assertEquals("DOUBLE", doubleRoom.name());
        assertEquals("DELUXE", deluxe.name());
    }
}