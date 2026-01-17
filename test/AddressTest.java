import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    public void testFullAddressFormatting_AAA() {
        // 1. Arrange
        String street = "Street 1";
        String city = "City A";
        Address addr = new Address(street, city);

        // 2. Act
        String result = addr.getFullAddress();

        // 3. Assert
        assertEquals("Street 1, City A", result);
    }
}