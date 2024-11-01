import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to help with skipping duplicates and using two-pointer approach
        Arrays.sort(nums);
        
        // Loop through each element, treating `nums[i]` as the first element in a quadruplet
        for (int i = 0; i < nums.length - 3; i++) {
            
            // Skip duplicates for the first element in the quadruplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Loop through each subsequent element for the second element in the quadruplet
            for (int j = i + 1; j < nums.length - 2; j++) {

                // Optimization: if `nums[i] + nums[j]` exceeds target and is positive, exit early
                if (nums[i] + nums[j] > target && (nums[i] + nums[j]) >= 0) break;

                // Skip duplicates for the second element in the quadruplet
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Initialize two pointers for the third and fourth elements
                int k = j + 1;
                int l = nums.length - 1;
                
                // Calculate the sum of the first two elements and the new target sum for the other two
                long firstSum = (long) nums[i] + (long) nums[j];
                long targetSum = target - firstSum;
                
                // Use two-pointer approach to find the third and fourth elements
                while (k < l) {
                    long secondSum = (long) nums[k] + (long) nums[l];
                    
                    if (secondSum > targetSum) {
                        // If sum of `nums[k]` and `nums[l]` is too large, move `l` leftward
                        l--;
                    } else if (secondSum < targetSum) {
                        // If sum of `nums[k]` and `nums[l]` is too small, move `k` rightward
                        k++;
                    } else {
                        // If we find a match, add the quadruplet to the result list
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        
                        // Move both pointers inward and skip duplicates for both `nums[k]` and `nums[l]`
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
            }
        }
        
        return result;
    }
}

