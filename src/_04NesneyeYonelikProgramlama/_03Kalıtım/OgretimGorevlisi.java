package _04NesneyeYonelikProgramlama._03Kalıtım;

public class OgretimGorevlisi extends Akademisyen{

    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo){
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    // Bu sınıfın atası olan akademisten sınıfında giris metodu vardı ve bunun yerine kullanılabilirdi.
    // Ama override kullanarak onu bu sınıf için geçersiz kılıp bu sınıfa özel bir giris metodu yapıyoruz.
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " Ogretim gorevlisi B kapisindan giris yapti.!");
    }
}
