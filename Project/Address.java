package Project;

public class Address {

    public String createAddress(String country){
        return String.format("Country: %s", country);
    }
    
    public String createAddress(String country, String city){
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, String postalCode){
        return String.format("Country: %s, City: %s, Postal code: %s", country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode, String streetName){
        return String.format("Country: %s, City: %s, Postal code: %s, Street name: %s", country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode, String streetName, int flatNumber){
        return String.format("Country: %s, City: %s, Postal code: %s, Street name: %s, Flat number: %d", country, city, postalCode, streetName, flatNumber);
    }
}
