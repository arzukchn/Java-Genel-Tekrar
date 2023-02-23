package _03ErisimBelirleyiciler.StringAnahtarSozcugu;

public class Calculate {

    public static void calcAvarage(Course[] notes){
        double total = 0;
        for(Course c : notes){
            total += c.note;
        }

        double avarage = total / notes.length;

        System.out.println("Ortalamaniz : " + avarage);
    }
}
