import java.util.Date;

public class Reservation {
    private final int number;
    private final Date startDate;
    private final Date endDate;
    private final Date reservationDate;
    
    // Relationships from UML
    private final ReserverPayer payer;
    private final Room assignedRoom;

    /**
     * Constructor for Reservation
     * WP7: Defensive Programming - ensuring no null objects or invalid date ranges
     */
    public Reservation(int number, Date start, Date end, ReserverPayer payer, Room room) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Start and End dates cannot be null.");
        }
        if (end.before(start)) {
            throw new IllegalArgumentException("Check-out date cannot be before Check-in date.");
        }
        if (payer == null || room == null) {
            throw new IllegalArgumentException("Payer and Room must be assigned to a reservation.");
        }

        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.reservationDate = new Date(); // Captures the exact moment the booking was made
        this.payer = payer;
        this.assignedRoom = room;
    }

    // --- GETTERS (Resolves "field not used" warnings and supports WP8 Interdependence) ---

    public int getNumber() {
        return number;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public ReserverPayer getPayer() {
        return payer;
    }

    public Room getAssignedRoom() {
        return assignedRoom;
    }
}