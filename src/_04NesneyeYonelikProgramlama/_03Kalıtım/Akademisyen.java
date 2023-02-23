package _04NesneyeYonelikProgramlama._03Kalıtım;

public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan){

        //Super anahtar sözcüğü bir üst sınıftan miras alan bir
        //sınıfın üst sınıfın metotlarını , özelliklerini alt sınıftan çağırmamıza ve kullanmamıza olanak sağlar .
        super(adSoyad, telefon, eposta);
        this.unvan = unvan;
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() +  " derse giris yapti!");
    }

    // Giris metodu akademisyenin atası olan calisan sınıfında da vardı ve burda da kullanılabilirdi.
    // Ancak override kullanarak aynı isimde ama buraya özel şekilde giris metodu oluşturuyoruz.
    // Yani atadan gelen metodu geçersiz kılıyoruz. işte override bu işe yarar.
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyeni A kapisindan giris yapti!");
    }
}
