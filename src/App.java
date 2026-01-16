import java.util.Date;

public class App {
    public static void main(String[] args) {
        try {
            // 1. Setup the Infrastructure
            HotelChain myChain = new HotelChain("Luxury Stays");
            Hotel hotel = new Hotel("The Grand Palace");
            
            RoomType deluxeType = new RoomType(RoomKind.DELUXE, new Money(250.0));
            Room r1 = new Room(101);
            r1.setRoomType(deluxeType);
            hotel.addRoom(r1);

            // 2. Fix: Create Identity object for ReserverPayer
            Identity customerId = new Identity("CUST-7788");
            CreditCard card = new CreditCard("1111222233334444");
            
            // Now the arguments match (Identity, CreditCard)
            ReserverPayer payer = myChain.createReserverPayer(customerId, card);
            System.out.println("Payer created with Identity: " + customerId.getIdValue());

            // 3. Perform Reservation logic
            System.out.println("Searching for available rooms...");
            Reservation myRes = myChain.makeReservation(hotel, new Date(), new Date(), payer);
            
            System.out.println("Reservation Successful! ID: " + myRes.getNumber());

            // 4. Perform Check-in
            Address addr = new Address("Main Street", "Karachi");
            myChain.checkInGuest(myRes, "Syed Saad Luqman", addr);
            
            System.out.println("Guest checked in to Room: " + r1.getNumber());
            System.out.println("Current Occupant: " + r1.getOccupant().getName());

        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        }
    }
}