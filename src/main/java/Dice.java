import java.util.Random;
// create a Dice class that acts like a set of N random-tossed dies

public class Dice { // Dice() adjust later to pass through the number of die used
    Integer numberOfDie;

    public Dice(Integer numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    public Integer tossAndSum() {
        Integer sumOfDie = 0;
        Random randomNum = new Random();
        for (int i = 1; i <= numberOfDie; i++) {
            sumOfDie = sumOfDie + (1 + randomNum.nextInt(6));
        }
        return sumOfDie;
    }

    // make a couple of unit tests for the Dice class
}
