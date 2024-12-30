class Solution {
    public int findPeakElement(int[] nums) {
        // Get the length of the array
        int n = nums.length;
        
        // Initialize the binary search boundaries
        int left = 0;
        int right = n - 1;

        // Binary search to find a peak
        while (left < right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Compare mid element with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // If mid is smaller than its right neighbor, move left to mid + 1
                left = mid + 1;
            } else {
                // Otherwise, move right to mid
                right = mid;
            }
        }

        // Return the index of the peak
        return left;
    }
}
