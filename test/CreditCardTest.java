import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    @Test
    public void testCardNumberStorage_AAA() {
        // Arrange
        String cardNumber = "1111222233334444";
        
        // Act
        CreditCard card = new CreditCard(cardNumber);
        
        // Assert
        assertEquals("1111222233334444", card.getCardNumber());
    }
}