public class Identity {
    private final String idValue;

    public Identity(String idValue) {
        if (idValue == null || idValue.trim().isEmpty()) {
            throw new IllegalArgumentException("Identity value cannot be empty.");
        }
        this.idValue = idValue;
    }

    public String getIdValue() {
        return idValue;
    }
}