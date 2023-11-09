import java.util.Scanner;

public class Shop {

    public void makeBear(){
        Scanner scanner = new Scanner(System.in);
        int totalBuilt = 0;
        System.out.println("How many bears to build?");
        int usrchoice = scanner.nextInt();
        for (int i = 0; i < usrchoice; i++) {
            int bearToBuild = 0;
            if(totalBuilt % 2 == 0 && totalBuilt != 0){
                bearToBuild = 2;
            } else if (totalBuilt % 5 == 0 && totalBuilt != 0) {
                bearToBuild = 3;
            }
            else{
                bearToBuild = 1;
            }
            switch(bearToBuild){
                case 1:
                    totalBuilt++;
                    DrunkBear drunk = new DrunkBear();
                    System.out.println("Drunkard built");
                    while (drunk.batteryLevel != 0 && !drunk.alseep) {
                        drunk.talk();
                    }
                    break;
                case 2:
                    totalBuilt++;
                    SimpleBear simple = new SimpleBear();
                    System.out.println("Simpelton built");
                    while(simple.batteryLevel != 0) {
                        simple.talk();
                    }
                    break;
                case 3:
                    totalBuilt++;
                    CrankyBear cranky = new CrankyBear();
                    System.out.println("Crankhead built");
                    while(cranky.batteryLevel != 0) {
                        cranky.talk();
                    }
                    break;
            }
        }
    }
}
