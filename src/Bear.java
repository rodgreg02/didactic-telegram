public class Bear {
    int batteryLevel;

    public void talk() {
        if (this.batteryLevel != 0) {
            System.out.println("I Love You!");
            this.batteryLevel--;
        } else {
            System.out.println("Dead");

        }
    }
}
