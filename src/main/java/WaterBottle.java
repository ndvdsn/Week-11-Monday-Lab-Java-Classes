public class WaterBottle {


    private int volume;


    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink10(){
        int drink = 10;
        return this.volume - drink;
    }

    public int empty(){
        int husk = 0;
        return this.volume = husk;
    }

    public int fullBottle(){
        int filled = 100;
        return this.volume = filled;
    }


}
