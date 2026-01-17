import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReserverPayerTest {
    @Test
    public void testPayerInterdependence_AAA() {
        // Arrange
        Identity id = new Identity("CUST-1");
        CreditCard card = new CreditCard("1111222233334444");

        // Act
        ReserverPayer payer = new ReserverPayer(id, card);

        // Assert
        assertEquals(id, payer.getIdentity());
        assertEquals(card, payer.getCreditCard());
    }
}