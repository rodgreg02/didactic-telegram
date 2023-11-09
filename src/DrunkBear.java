import java.util.Random;

public class DrunkBear extends Bear{
    boolean alseep;

    public DrunkBear(){
        this.batteryLevel = 100;
        this.alseep = false;
    }
    @Override
    public void talk(){
        Random rnd = new Random();
        if(this.batteryLevel != 0) {
            if (rnd.nextInt(99) + 1 < 2 || this.alseep == true) {
                System.out.println("Snore...Snoree");
                this.alseep = true;
            } else{
                System.out.println("I Love You");
                this.batteryLevel--;
            }
        }
        else{
            System.out.println("Dead");
            batteryLevel--;
        }
    }
}
