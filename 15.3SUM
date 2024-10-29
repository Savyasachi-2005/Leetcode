class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List to store the result as lists of integer triplets that sum up to zero
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to make it easier to avoid duplicates and use the two-pointer approach
        Arrays.sort(nums);
        
        // Loop through each number in the array, stopping two elements before the end
        // since we need at least three numbers to form a triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the element if it's the same as the previous one to avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Set two pointers: `left` starts just after `i` and `right` starts from the end of the array
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use two-pointer approach to find pairs that, along with nums[i], sum to zero
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                // If the sum of the triplet is zero, add it to the result list
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move both pointers inward and skip duplicate elements to avoid repeated triplets
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;  // Skip duplicates for `left`
                    while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicates for `right`
                }
                // If the sum is less than zero, move the `left` pointer right to increase the sum
                else if (sum < 0) {
                    left++;
                }
                // If the sum is greater than zero, move the `right` pointer left to decrease the sum
                else {
                    right--;
                }
            }
        }
        return result;  // Return the list of triplets that sum up to zero
    }
}
