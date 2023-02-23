//Aynı isme sahip birden fazla metodun farklı parametreler alma olayı
//Gördüğün gibi altta print isminde 3 farklı metodum var ama hepsinin parametresi farklı
//Bu yüzden bir hata almıyorum ve hangisini çağırısam o geliyor. Ancak print ismine aşırı yüklenme var

public class AşırıYukleme {
    static void print(){
        System.out.println("Parametresiz metod");
    }
    static void print(int a){
        System.out.println("Parametre: " + a);
    }

    static int print(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        print();
        print(12);
        System.out.println("Parametre toplami: " + print(5, 10));
    }

}
