class Solution {
    public int missingNumber(int[] nums) {
        // Calculate the total number of elements in the array
        int n = nums.length;

        // Compute the expected sum of numbers from 0 to n using the formula for sum of first n numbers
        int total = n * (n + 1) / 2;

        // Initialize a variable to calculate the actual sum of numbers in the array
        int sum = 0;

        // Iterate through the array and compute the sum of its elements
        for (int num : nums) {
            sum += num;
        }

        // The missing number is the difference between the expected total and the actual sum
        return total - sum;
    }
}
