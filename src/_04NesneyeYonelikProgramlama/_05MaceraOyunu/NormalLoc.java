package _04NesneyeYonelikProgramlama._05MaceraOyunu;

public class NormalLoc extends Location {

    public NormalLoc(Player player, String name){
        super(player, name);
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}
