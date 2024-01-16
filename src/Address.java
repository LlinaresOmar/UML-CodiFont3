public class Address {

    private String street;
    private String city;
    private int postalCode;
    private Person person;

    public Address(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(String street, String city, int postalCode, Person person) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.person = person;
    }
}
