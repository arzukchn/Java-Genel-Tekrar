package _15PatikaStoreÖdevi.Abstraction;

public interface IProduct {

    //Id
    public int getId();

    //Marka
    public String getBrand();

    public void setBrand(String name);

    //Birim Fiyat
    public double getUnitPrice();

    public void setUnitPrice(double unitPrice);

    //İndirim
    public double getDiscount();

    public void setDiscount(double discount);
}
