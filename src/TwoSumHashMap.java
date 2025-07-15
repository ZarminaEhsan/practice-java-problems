import java.util.*;

public class TwoSumHashMap {
    public int[] twoSumHashMap(int[] nums, int target) {

        // Contraint 1:
        if (nums.length < 2 || nums.length > 10_000) {
            throw new IllegalArgumentException("Array length must be between 2 and 10,000.");
        }

        // Contraint 2:
        if (target < -1_000_000_000 || target > 1_000_000_000) {
            throw new IllegalArgumentException("The target value must be between -1000000000 and 1000000000.");
        }

        // Contraint 3:
        for (int n : nums ) {
            if (n < -1_000_000_000 || n > 1_000_000_000) {
                throw new IllegalArgumentException("Elements of the array must be between -1000000000 and 1000000000.");
            }
        }

        // Use HashMap to find two indices such that their sum equals target value
        // Declare hashmap where Keys are int and values are int arrays
        HashMap<Integer, Integer> sum = new HashMap<>();

        // Iterate through the array and add elements to the Hashmap
        for (int i = 0; i < nums.length; i++){
            sum.put(nums[i], i);
        }
        System.out.println("HashMap: " + sum);

        // Iterate through the array and finding the value
        for (int i = 0; i < nums.length; i++){
            int valueToFind = target - nums[i];

            // checking if complement exists in the hashmap
            //boolean containsValue = sum.containsValue(valueToFind);

            if (sum.containsKey(valueToFind)) {
                return new int[] { i, sum.get(valueToFind) };
            }
        }

        // In case there is no solution, return an empty array
        return new int[] {};
    }
}

