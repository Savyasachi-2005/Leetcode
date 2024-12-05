class Solution {
    public int mySqrt(int x) {
        // Return 0 for negative input as square root is not defined for negative numbers
        if (x < 0) {
            return 0;
        }
        
        // If x is 0 or 1, return x itself as the square root
        if (x == 0 || x == 1) {
            return x;
        }
        
        // Initialize binary search range
        int left = 0, right = x, ans = 0;

        // Perform binary search
        while (left <= right) {
            // Calculate the mid-point to avoid overflow
            int mid = left + (right - left) / 2;

            // Check if mid^2 is less than or equal to x
            if (mid <= x / mid) {
                // Update the answer to mid as it is a possible result
                ans = mid;
                // Move the left pointer to search for a larger possible result
                left = mid + 1;
            } else {
                // Move the right pointer to search for a smaller possible result
                right = mid - 1;
            }
        }

        // Return the computed integer square root
        return ans;
    }
}
