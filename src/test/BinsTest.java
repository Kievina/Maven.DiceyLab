import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class BinsTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getBin() {
        // Given
        Integer start = 2;
        Integer end = 12;
        Integer expectedIdx0 = 0;
        Integer expectedIdx10 = 0;

        // When
        Bins bin = new Bins(start, end);

        // Then
        Integer actualResultsIdx0 = bin.getBin(0);
        Integer actualResultsIdx10 = bin.getBin(10);

        Assert.assertEquals(expectedIdx0, actualResultsIdx0);
        Assert.assertEquals(expectedIdx10, actualResultsIdx10);

    }

    @Test
    public void incrementBin() {
        // Given
        Integer start = 2;
        Integer end = 12;
        Integer dieSum = 6;
        Integer expectedBin6Count = 2;

        // When
        Bins bin = new Bins(start, end);
        bin.incrementBin(dieSum);
        bin.incrementBin(dieSum);

        // Then
        Integer actualBin6Count = 2;

        Assert.assertEquals(expectedBin6Count, actualBin6Count);
    }
}
