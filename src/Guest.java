public class Guest {
    private String name;
    private Address addressDetails;

    public Guest(String name, Address address) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty.");
        }
        this.name = name;
        this.addressDetails = address;
    }

    public String getName() {
        return name;
    }

    // Adding this getter removes the "not used" warning
    public Address getAddressDetails() {
        return addressDetails;
    }
}