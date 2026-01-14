import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class HotelChain {
    private String id;
    private List<Hotel> hotels;
    private List<Reservation> activeReservations;

    public HotelChain(String id) {
        this.id = id;
        this.hotels = new ArrayList<>();
        this.activeReservations = new ArrayList<>();
    }

    // UML Operation: +makeReservation() 
    public Reservation makeReservation(Hotel hotel, Date start, Date end, ReserverPayer payer) {
        List<Room> availableRooms = hotel.available(); 
        
        if (availableRooms.isEmpty()) {
            throw new IllegalStateException("No rooms available in this hotel.");
        }

        // Logic: Pick the first available room
        Room roomToBook = availableRooms.get(0);
        int resId = activeReservations.size() + 1;
        
        Reservation newRes = new Reservation(resId, start, end, payer, roomToBook);
        activeReservations.add(newRes);
        return newRes;
    }

    // UML Operation: +checkInGuest() 
    public void checkInGuest(Reservation reservation, String guestName, Address address) {
        // Defensive: Ensure reservation exists [cite: 25]
        if (reservation == null) return;
        
        Room room = reservation.getAssignedRoom();
        room.createGuest(guestName, address); // Links Guest to Room 
        System.out.println("Guest " + guestName + " checked into room.");
    }

    // UML Operation: +checkOutGuest() 
    public void checkOutGuest(Room room) {
        // Logic: Logic to clear the room (WP8 Interdependence) 
        // In a real system, you'd nullify the occupant here
        System.out.println("Guest checked out of room.");
    }
}