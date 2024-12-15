//These Collections are important for solving the problem.
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*                        */

class Solution {
    // Function to find target indices after sorting the array
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums); // Sorting the array in non-decreasing order
        
        // Step 2: Find indices where nums[i] == target
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                ans.add(i); // Add index to the result list if it matches the target
            }
        }

        // Step 3: Sort the result list
        Collections.sort(ans); // Sorting the list of indices
        
        return ans; // Return the sorted indices
    }
}
