import java.util.Random;

public class CrankyBear extends Bear {
    boolean sang;

    public CrankyBear(){
        this.sang = false;
        this.batteryLevel = 100;
    }

    @Override
    public void talk() {
        if (this.batteryLevel > 50) {
            System.out.println("I Love You");
            this.batteryLevel--;
        } else if(!sang){
                System.out.println("Dead");
            batteryLevel--;
            }
            else{
                System.out.println("Sad song");
                this.sang = true;
            }
        }

    }
