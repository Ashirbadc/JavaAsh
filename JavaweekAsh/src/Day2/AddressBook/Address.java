package Day2.AddressBook;

/**
 * Created by student on 04/05/2016.
 */
public class Address {
    private String street;
    private String city;
    private String country;
    private String postcode;

    public Address(){}

    public Address(String st, String city, String country, String postcode)
    {
        this.street = st;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }

    public String getStreet() {return street; }
    public void getStreet(String street) {this.street = street; }

    public String getCity() {return city; }
    public void getCity(String city) {this.city = city; }

    public String getCountry() {return country; }
    public void getCountry(String country) {this.country = country; }

    public String getPostcode() {return postcode; }
    public void getPostcode(String postcode) {this.postcode = postcode; }

    @Override
    public String toString() {
        return String.format(
                        "Street Address: %s, City: %s, Country: %s, Postcode: %s ", street, city, country, postcode);
    }
}
