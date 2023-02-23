package _01Sınıflar.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Vergi
    double tax(double salary){
        if(this.salary>100){
            return salary*(0.03);
        }
        return salary * 0;
    }


    int bonus(int workHours){
        int moreHours;
        int totalBonus =0 ;
        if(workHours>0){
            moreHours = workHours -40;
            totalBonus = moreHours*30;
            return totalBonus;
        }
        return totalBonus;
    }

    double raiseSalary(int hireYear){
       int todaysYear = 2021;
       if((todaysYear - hireYear) < 10){
           return (this.salary * 0.05);
       }else if((todaysYear - hireYear > 9) && (todaysYear - hireYear <20)){
           return (this.salary * 0.10);
       }else if((todaysYear - hireYear) > 20){
           return (this.salary *0.15);
       }
       return 0;
    }

    void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma saati: " + this.workHours);
        System.out.println("Baslangic yili: " + this.hireYear);
        System.out.println("Vergi: " + tax(this.salary));
        System.out.println("Bonus: " + bonus(this.workHours));
        System.out.println("Maas artisi: " + raiseSalary(this.hireYear));
        System.out.println("Vergi ve bonuslar eklenince maas: " + (this.salary - tax(this.salary) + bonus(workHours)));
        System.out.println("Toplam maas: " + (this.salary - tax(this.salary) + bonus(this.workHours) + raiseSalary(this.hireYear)));
    }
}
