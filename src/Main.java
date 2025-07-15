/*
Maximum difference between Even and Odd Frequency
 */

// import the HashMap class
import java.util.*;


public class Main {
    public static void main(String[] args) {

        String s = "aaabbc";

        // Object of MaxDifference class
        MaxDifference maxDifference = new MaxDifference();
        maxDifference.maxDifference(s);

        int[] nums = {2,7,11,15};
        int target = 26;

        // Object of TwoSum class
        TwoSum twoSum = new TwoSum();
        int[] twoSumResult = twoSum.twoSum(nums, target);
        if ( twoSumResult[0] == -1){
            System.out.println("No matching pair found such that their sum gives the target value");
        }
        else{
            System.out.println(Arrays.toString(twoSumResult));
        }

        // Object of TwoSumHashMap class
        TwoSumHashMap twoSumHashMap = new TwoSumHashMap();
        int[] twoSumHashMapResult = twoSumHashMap.twoSumHashMap(nums, target);
        if ( twoSumHashMapResult.length == 0){
            System.out.println("No matching pair found such that their sum gives the target value");
        }
        else{
            System.out.println(Arrays.toString(twoSumHashMapResult));
        }

    }
}