---

## 1. Project Overview

This project is a high-fidelity implementation of a **Hotel Management System** derived from a professional UML class diagram. It is designed using **Object-Oriented Programming (OOP)** principles to manage the lifecycle of hotel stays.

* **Domain Logic**: Handles the relationship between a `HotelChain`, its individual `Hotels`, and the `Rooms` within them.
* **Booking Lifecycle**: Manages the creation of `ReserverPayer` profiles, room availability checks, and the generation of `Reservation` entities.
* **Defensive Design**: The system prevents invalid states, such as negative room numbers or reservations where the checkout date precedes the check-in date.
* **Data Integrity**: Uses Java `records` for immutable value objects (like `Money` and `Address`) and strict access modifiers to encapsulate business logic.

---

## 2. Build Instructions

Since you are using a manual folder structure without Maven, you must compile the classes in a specific order (or all at once) so that the Java compiler can resolve dependencies between packages.

1. **Open the Terminal** in VS Code (Ctrl + `).
2. **Navigate** to your root folder: `cd HotelSystem`
3. **Compile all files** using the following command. This command finds all `.java` files in your `src` directory and compiles them into the current folder:

```bash
# For Windows (Command Prompt/PowerShell)
javac -d . src/com/hotel/types/*.java src/com/hotel/model/*.java src/com/hotel/service/*.java

# For Mac/Linux
javac -d . src/com/hotel/types/*.java src/com/hotel/model/*.java src/com/hotel/service/*.java

```

*The `-d .` flag tells Java to create the folder structure for the compiled `.class` files automatically based on their package names.*

---

## 3. Test Instructions (Manual Verification)

Without Maven's `mvn test`, we will use a "Runner" class to verify the system. Create this file in your **`src`** folder.

**File: `src/TestSystem.java**`

```java
import com.hotel.types.*;
import com.hotel.model.*;
import com.hotel.service.*;
import java.time.LocalDate;

public class TestSystem {
    public static void main(String[] args) {
        System.out.println("--- Starting Hotel System Test ---");

        try {
            // 1. Setup Chain and Hotel
            HotelChain chain = new HotelChain();
            Hotel cityCenter = new Hotel(new Name("City", "Center"));
            chain.addHotel(cityCenter);

            // 2. Add a Room
            Room room101 = new Room(101);
            cityCenter.addRoom(room101);

            // 3. Create a Payer
            ReserverPayer payer = chain.createReserverPayer(
                new CreditCard("4444-5555-6666-7777", "12/29"),
                new Identity("ID-123", "Passport")
            );

            // 4. Test Reservation
            Reservation res = chain.makeReservation(
                cityCenter, payer, 
                LocalDate.now(), 
                LocalDate.now().plusDays(3), 
                101
            );

            System.out.println("SUCCESS: Reservation created for Room 101.");
            
            // 5. Test Defensive Logic (Should Fail)
            System.out.println("Testing Defensive Logic (Invalid Dates)...");
            new Reservation(LocalDate.now(), LocalDate.now().plusDays(5), LocalDate.now().minusDays(1), 99);

        } catch (IllegalArgumentException e) {
            System.out.println("PASSED: Defensive check caught invalid dates: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("FAILED: Unexpected error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

```

### To run the test:

1. **Compile the test file**:
```bash
javac -d . src/TestSystem.java

```


2. **Execute the test**:
```bash
java TestSystem

```



