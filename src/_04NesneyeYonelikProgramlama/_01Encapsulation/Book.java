package _04NesneyeYonelikProgramlama._01Encapsulation;


//Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya
// niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir.


//Değişkenler
public class Book {
    public String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        if(pageNumber<0){
            pageNumber=0;
        }
        this.pageNumber = pageNumber;
    }

    //Değişkenleri değiştirebilecek metodlar
    //Bunlar get/set metodları işte
    public int showPageNumber(){
        return pageNumber;
    }

    public void changePageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
}
