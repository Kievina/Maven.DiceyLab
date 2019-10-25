public class Simulation {
    Integer numberOfDie;
    Integer numberOfTosses;
    Dice dice = new Dice(2);
    Bins bin = new Bins(2, 12);

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        //loop through results
        for(int i = 0; i < results.length; i++) {

        }
        //print  elements in results
        //use results.getBin(binTotal) to access totals in each bin
        //calculate percent of each bin out of NumberOfTosses
        //print stars to represent the percent for each bin

    }


}
