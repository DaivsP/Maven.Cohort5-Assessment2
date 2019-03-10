package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
//        List<String > arrayList = new ArrayList<>();
//        arrayList.addAll(Arrays.asList(arrayToBeSpliced));
//        List<String> answer = arrayList.subList(startingIndex, endingIndex);
//        return answer.toArray(new String[0]);
        return Arrays.copyOfRange(arrayToBeSpliced, startingIndex, endingIndex);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
//        List<String > answer = new ArrayList<>();
//        answer.addAll(Arrays.asList(arrayToBeSpliced));
//        answer.subList(startingIndex, 5);
//        return answer.toArray(new String[0]);
        return Arrays.copyOfRange(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
    }
}
