public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;


    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.printResults(sim.runSimulation());
    }

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    private Bins runSimulation() {
        Dice dice = new Dice(numberOfDie);
        Bins bin = new Bins(numberOfDie, numberOfDie * 6);
        for (int i = 0; i < numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
        return bin;
    }

    private void printResults(Bins bin) {
        int arrayLength = numberOfDie * 6 + 1;
        //loop through results array and divide by the total number of tosses
        for (int i = numberOfDie; i < arrayLength; i++) {
            System.out.print(String.format("%2d : %6d : %1.2f\t", i, bin.getBin(i), binPercent(bin.getBin(i))));
            printStars(binPercent(bin.getBin(i)));
            System.out.println();
        }
    }

    public void printStars(Double value) {
        int numberOfStars = (int) (value * 100);
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
    }

    public double binPercent(Integer value) {
       return ((double) value) / numberOfTosses;
    }
}
