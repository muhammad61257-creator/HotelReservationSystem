import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GuestTest {

    @Test
    public void testGuestCreation_AAA() {
        // 1. Arrange
        Address addr = new Address("Street 1", "City A");
        String name = "John Doe";

        // 2. Act
        Guest guest = new Guest(name, addr);

        // 3. Assert
        assertEquals("John Doe", guest.getName());
        assertNotNull(guest.getAddress());
        assertEquals("Street 1, City A", guest.getAddress().getFullAddress());
    }
}