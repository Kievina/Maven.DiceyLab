import org.junit.Before;
import org.junit.Test;


import org.junit.Assert;


public class SimulationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void runSimulation() {
    }

    @Test
    public void printResults() {
    }

    @Test
    public void binPercent() {
        // Given
        Integer binCount3 = 30;
        double expectedResults = 0.03;

        // When
        Simulation sim = new Simulation(2, 1000);
        double actualResults = sim.binPercent(binCount3);

        // Then
        Assert.assertEquals(expectedResults, actualResults, 0.00);

    }
}
