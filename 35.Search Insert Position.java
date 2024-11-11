class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;  // Initialize the left pointer to the start of the array
        int right = nums.length - 1;  // Initialize the right pointer to the end of the array
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate the middle index to avoid overflow

            // If the target is found at the middle position, return the index
            if (nums[mid] == target) {
                return mid;
            }
            // If the middle value is greater than the target, search the left half
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            // If the middle value is less than the target, search the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        
        // If the target is not found, return the index where the target can be inserted
        return left;
    }
}
