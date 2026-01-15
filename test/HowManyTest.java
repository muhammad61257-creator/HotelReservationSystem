import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class HowManyTest {
    @Test
    public void testQuantityAssociation_AAA() {
        // 1. Arrange - We need real objects to satisfy the Reservation constructor
        Room dummyRoom = new Room(101);
        Identity dummyId = new Identity("TEST-ID");
        CreditCard dummyCard = new CreditCard("0000111122223333");
        ReserverPayer dummyPayer = new ReserverPayer(dummyId, dummyCard);
        
        // Creating the Reservation with valid objects instead of 'null'
        Reservation res = new Reservation(1, new Date(), new Date(), dummyPayer, dummyRoom);
        int quantity = 3;
        
        // 2. Act
        HowMany association = new HowMany(quantity, res);
        
        // 3. Assert
        assertEquals(3, association.getNumber());
        assertEquals(res, association.getReservation());
    }
}