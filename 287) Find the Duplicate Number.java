import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Sort the array
        // Sorting the array ensures that duplicates will appear next to each other
        Arrays.sort(nums);
        
        // Step 2: Iterate through the sorted array
        for (int i = 0; i < nums.length - 1; i++) {
            // Step 3: Check if the current element is equal to the next element
            if (nums[i] == nums[i + 1]) {
                // Duplicate found, return the duplicate value
                return nums[i];
            }
        }
        
        // Step 4: If no duplicate is found, return -1
        // This line is redundant since the problem guarantees a duplicate exists,
        // but it is added as a safeguard for unexpected inputs
        return -1;
    }
}
