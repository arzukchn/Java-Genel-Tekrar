package _01Sınıflar.BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if(isCheck()){
            while(this.f1.healty > 0 && this.f2.healty >0){
                System.out.println("====YENI ROUND====");
                this.f2.healty = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.healty = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Saglik: " + this.f1.healty);
                System.out.println(this.f2.name + " Saglik: " + this.f2.healty);

            }
        }else{
            System.out.println("Sporcularin sikletleri uymuyor !!!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight<= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.healty == 0) {
            System.out.println(this.f2.name + " kazandi!");
            return true;
        }
        if (this.f2.healty == 0) {
            System.out.println(this.f1.name + " kazandi!");
        }
        return false;
    }
}
