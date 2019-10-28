
public class Bins {
    private Integer start;
    private Integer end;
    private Integer[] results;

    public Bins(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        Integer endIdx = end + 1;
        results = new Integer[endIdx];
        //fill results array with zeroes beginning with lowest die sum; index 0 and 1 null
        for (int i = start-2; i < results.length; i++) {
            results[i] = 0;
        }
    }

    // retrieve the count for a specific sum: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
    // the sum is the same as the index of the array where it is stored
    public Integer getBin(Integer countOfNum) {
        return results[countOfNum];
    }

    public void incrementBin(Integer binIdx) {
        //binIdx is equal to result from calling dice.tossAndSum()
        results[binIdx]++;
    }
}
