public class TwoSum {
    public int[] twoSum(int[] nums, int target){

        // Constraint check 1: Length of the array
        if (nums.length < 2 || nums.length > 10_000) {
            throw new IllegalArgumentException("Array length must be between 2 and 10,000.");
        }

        // Constraint check 2: Elements range of the array
        for (int n : nums) {
            if (n < -1_000_000_000 || n > 1_000_000_000) {
                throw new IllegalArgumentException("Each number in the array must be between -1000000000 and 1000000000.");
            }
        }

        // Constraint check 3: Target range
        if (target < -1_000_000_000|| target > 1_000_000_000) {
            throw new IllegalArgumentException("The target value must be between -1000000000 and 1000000000.");
        }

        //return indices of the two numbers such that they add up to target using brute force method
        for (int i = 0; i < nums.length; i++ ){
            for (int j = i + 1 ; j < nums.length; j++){
                if ( nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
