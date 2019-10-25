
public class Bins {
    private Integer start;
    private Integer end;
    Integer[] results;

    public Bins(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        //Integer startIdx = 0;
        Integer endIdx = end + 1;
        results = new Integer[endIdx];
        for (int i = start-2; i < results.length; i++) {
            results[i] = 0;
        }
    }


    //fill results with zeros leave index 0 and 1 null use for loop


    // retrieve the count for a specific sum: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
    public Integer getBin(Integer countOfNum) {
        return results[countOfNum];
    }

    public void incrementBin(Integer binIdx) {
        //binIdx is equal to result from calling tossAndSum() on dice
        results[binIdx]++;
    }

    //Bins results = new Bins(2, 12); // for bins from 2..12
    //Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
    //results.incrementBin(10); // should increment bin # 10
}
