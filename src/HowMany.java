public class HowMany {
    private final int number;
    private final Reservation reservation; // The field causing the warning

    public HowMany(int number, Reservation reservation) {
        if (number <= 0) {
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        this.number = number;
        this.reservation = reservation;
    }

    // This Getter removes the "not used" warning
    public Reservation getReservation() {
        return reservation;
    }

    public int getNumber() {
        return number;
    }
}