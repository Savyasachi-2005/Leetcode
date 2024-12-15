//First Approach 
class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Find the middle element of the sorted array
        // Since the majority element appears more than n/2 times,
        // it will always occupy the middle index in a sorted array
        int n = nums.length;
        return nums[n / 2]; // Return the middle element as the majority element
    }
}
//Second Approach
class Solution {
    public int majorityElement(int[] nums) {
        // Initialize the candidate to the first element
        // and set the count to 0
        int candidate = nums[0], count = 0;

        // Traverse through the array to find the majority element
        for (int num : nums) {
            // If the count is 0, select the current number as the new candidate
            if (count == 0) {
                candidate = num;
            }
            // Update the count: increment if the current number matches the candidate,
            // otherwise decrement
            count += (num == candidate) ? 1 : -1;
        }

        // Return the candidate as the majority element
        return candidate;
    }
}
