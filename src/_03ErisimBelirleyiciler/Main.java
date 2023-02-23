package _03ErisimBelirleyiciler;

public class Main {
    public static void main(String[] args) {
        First a = new First("Hello World");
        System.out.println(a.str);
    }
    //public: her yerden erişilir.
    //private: sadece tanımlı olduğu sınıf içinde erişilir.
    //protected: Sadece aynı paket içinde olanlar erişebilir
    //default: protected kuralı + kalıtımla başka paketlerden erişebilme

}
