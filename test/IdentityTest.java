import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IdentityTest {
    @Test
    public void testIdentityValue_AAA() {
        // Arrange
        String passportNumber = "PK123456";
        
        // Act
        Identity id = new Identity(passportNumber);
        
        // Assert
        assertEquals("PK123456", id.getIdValue());
    }
}