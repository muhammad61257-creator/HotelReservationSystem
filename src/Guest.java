public class Guest {
    private String name;
    private Address address;

    public Guest(String name, Address address) {
        if (name == null || address == null) {
            throw new IllegalArgumentException("Name and Address cannot be null");
        }
        this.name = name;
        this.address = address;
    }

    // Add these getters to fix the test errors
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}