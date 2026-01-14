import java.util.*;

public class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number;
    
    // Relationships from UML
    private ReserverPayer payer;
    private Room assignedRoom;

    public Reservation(int number, Date start, Date end, ReserverPayer payer, Room room) {
        // Defensive Programming: Validate dates [cite: 25]
        if (end.before(start)) {
            throw new IllegalArgumentException("End date cannot be before start date."); 
        }
        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.reservationDate = new Date(); // Current date
        this.payer = payer;
        this.assignedRoom = room;
    }

    public int getNumber() { return number; }
    public Room getAssignedRoom() { return assignedRoom; }
} {
    
}
