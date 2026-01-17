import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTypeTest {
    @Test
    public void testRoomTypeAttributes_AAA() {
        // Arrange
        Money price = new Money(500.0);
        RoomKind kind = RoomKind.DELUXE;
        
        // Act
        RoomType type = new RoomType(kind, price);
        
        // Assert
        assertEquals(RoomKind.DELUXE, type.getKind());
        assertEquals(500.0, type.getPrice().getAmount());
    }
}