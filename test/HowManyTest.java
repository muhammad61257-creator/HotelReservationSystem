import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class HowManyTest {
    @Test
    public void testQuantityAssociation_AAA() {
        // Arrange
        Reservation res = new Reservation(101, new Date(), new Date(), null, null);
        int quantity = 3;
        
        // Act
        HowMany association = new HowMany(quantity, res);
        
        // Assert
        assertEquals(3, association.getNumber());
        assertEquals(res, association.getReservation());
    }
}