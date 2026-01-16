public class Address {
    private String street;
    private String city;

    // This constructor fixes the "undefined" error
    public Address(String street, String city) {
        if (street == null || city == null) {
            throw new IllegalArgumentException("Address fields cannot be null."); // WP7: Defensive Programming
        }
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city;
    }
}