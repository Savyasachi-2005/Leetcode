import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        // Initialize two pointers, left starting at the beginning, and right at the end of the array
        int left = 0;
        int right = height.length - 1;
        
        // Variable to keep track of the maximum area found
        int maxArea = 0;
        
        // This variable will store the minimum height of the boundary lines at each step
        int minArea = Integer.MAX_VALUE;
        
        // Loop until the left pointer meets the right pointer
        while (left < right) {
            // Find the minimum height between the left and right pointers
            minArea = Math.min(height[left], height[right]);
            
            // Calculate the area with the current boundaries and update maxArea if it's larger
            maxArea = Math.max(maxArea, minArea * (right - left));
            
            // Move the left pointer forward if its height is less than or equal to minArea,
            // because a taller boundary on the left might yield a larger area
            while (left < right && minArea >= height[left]) left++;
            
            // Move the right pointer backward if its height is less than or equal to minArea,
            // for the same reason as above - a taller boundary on the right might yield a larger area
            while (left < right && minArea >= height[right]) right--;
        }
        
        // Return the maximum area found
        return maxArea;
    }
}
