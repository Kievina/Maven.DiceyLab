public class DiceRollingMain {

    public static void main(String[] args) {
        //Bins bin = new Bins(0,13);

        Simulation sim = new Simulation(2, 50);
        //Dice dice = new Dice(5); // for yatzee

        //dice.tossAndSum()
        sim.runSimulation(2, 50);

        sim.printResults(2, 50);

    }
}
