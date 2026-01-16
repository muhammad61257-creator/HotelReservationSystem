import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelChain {
    private String name;
    private List<Hotel> hotels = new ArrayList<>();
    private List<Reservation> activeReservations = new ArrayList<>();

    public HotelChain(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Hotel Chain name cannot be empty.");
        }
        this.name = name;
    }

    // This method uses the 'hotels' list, clearing the warning
    public void addHotel(Hotel hotel) {
        if (hotel == null) throw new IllegalArgumentException("Hotel cannot be null");
        this.hotels.add(hotel);
    }

    // This method uses the 'name' field, clearing the warning
    public String getName() {
        return name;
    }

    // Matches UML: +createReserverPayer(Identity, CreditCard)
    public ReserverPayer createReserverPayer(Identity id, CreditCard card) {
        return new ReserverPayer(id, card);
    }

    // Matches UML: +makeReservation()
    public Reservation makeReservation(Hotel hotel, Date start, Date end, ReserverPayer payer) {
        List<Room> availableRooms = hotel.available();
        if (availableRooms.isEmpty()) {
            throw new IllegalStateException("No rooms available in " + hotel.getName());
        }

        Room roomToBook = availableRooms.get(0);
        int reservationId = activeReservations.size() + 1;
        
        Reservation res = new Reservation(reservationId, start, end, payer, roomToBook);
        activeReservations.add(res);
        return res;
    }

    public void checkInGuest(Reservation res, String guestName, Address addr) {
        if (res != null) {
            res.getAssignedRoom().createGuest(guestName, addr);
        }
    }
}