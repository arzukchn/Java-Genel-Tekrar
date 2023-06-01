package _16SigortaYönetimSistemiÖdevi.Adress;


public class HomeAdress implements Adress {

    private String street;
    private String city;
    private String country;
    private String postalCode;

    public HomeAdress(String street, String city, String country, String postaCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postaCode) {
        this.postalCode = postaCode;
    }

    @Override
    public String toString() {
        return "HomeAddress [street=" + street + ", city=" + city + ", country=" + country + ", postalCode="
                + postalCode
                + "]";
    }
}
