package people;

public class Address {
    private final String houseNameNumber;
    private final String street;
    private final String town;
    private final String postcode;

    Address(String houseNameNumber, String street, String town, String postcode) {
        this.houseNameNumber = houseNameNumber;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("houseNameNumber='").append(houseNameNumber).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", town='").append(town).append('\'');
        sb.append(", postcode='").append(postcode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
