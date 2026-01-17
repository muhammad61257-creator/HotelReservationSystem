import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testValidMoney_AAA() {
        // Arrange
        double amount = 250.0;
        // Act
        Money money = new Money(amount);
        // Assert
        assertEquals(250.0, money.getAmount());
    }

    @Test
    public void testNegativeMoney_ThrowsException() {
        // Arrange, Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Money(-50.0);
        });
    }
}