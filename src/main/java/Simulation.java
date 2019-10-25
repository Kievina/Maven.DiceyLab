public class Simulation {
    Integer start;
    Integer numberOfDie;
    Integer numberOfTosses;


    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 5000);

        sim.printResults(sim.runSimulation());

    }

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    public Bins runSimulation() {
        Dice dice = new Dice(numberOfDie);
        Bins bin = new Bins(numberOfDie, numberOfDie*6);
        for (int i = 0; i < numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
        return bin;
    }

    public void printResults(Bins bin) {
        Double[] percentArray = binPercent(bin);
        //loop through results
        for (int i = numberOfDie; i < percentArray.length; i++) {
            //if (bin.getBin(i) != null) {
                System.out.println(String.format("%2d : %6d : %1.2f %s", i, bin.getBin(i), percentArray[i], printStars(percentArray[i])));
            //}
        }
        //print  elements in results
        //use results.getBin(binTotal) to access totals in each bin
        //calculate percent of each bin out of NumberOfTosses
        //add getStars() methods that prints stars to represent the percent for each bin
    }

    public String printStars(Double value) {
        String rowOfStars = "";
        Integer numberOfStars = (int) (value * 100);
        for (int i = 1; i <= numberOfStars; i++) {
            rowOfStars += "*";
        }
        return rowOfStars;
    }

    public Double[] binPercent(Bins bin) {
        Double[] percentArray = new Double[numberOfDie * 6 + 1];
        for (int i = numberOfDie; i < numberOfDie * 6 + 1; i++) {
            //if (bin.getBin(i) != null) {
                percentArray[i] = ((double) bin.getBin(i)) / numberOfTosses;
            //}

        }
        return percentArray;
    }

}
