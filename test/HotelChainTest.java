import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HotelChainTest {
    @Test
    public void testPayerCreation_AAA() {
        // Arrange
        HotelChain chain = new HotelChain("Luxury");
        Identity id = new Identity("ID-01");
        CreditCard card = new CreditCard("1234123412341234");

        // Act
        ReserverPayer payer = chain.createReserverPayer(id, card);

        // Assert
        assertNotNull(payer);
        assertEquals("ID-01", payer.getIdentity().getIdValue());
    }
}