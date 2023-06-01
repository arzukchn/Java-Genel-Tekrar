package _16SigortaYönetimSistemiÖdevi.Adress;

public class BusinessAdress implements Adress{

    private String street;
    private String city;
    private String country;
    private String postalCode;
    private String companyName;

    public BusinessAdress(String street, String city, String country, String postaCode, String companyName) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postaCode;
        this.companyName = companyName;
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

    @Override
    public String getPostalCode() {
        return null;
    }

    @Override
    public void setPostalCode(String postalCode) {

    }

    public String getPostaCode() {
        return postalCode;
    }

    public void setPostaCode(String postaCode) {
        this.postalCode = postaCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessAddress [street=" + street + ", city=" + city + ", country=" + country + ", postalCode="
                + postalCode + ", companyName=" + companyName + "]";
    }
}
