class Solution {
    // Method to find the single number in an array where all other numbers appear twice
    public int singleNumber(int[] nums) {
        // Initialize the variable to store the unique number
        int ans = 0;
        
        // Iterate through each number in the array
        for (int num : nums) {
            // Use XOR to cancel out duplicate numbers
            // XOR Properties:
            // 1. x ^ x = 0 (any number XOR itself becomes 0)
            // 2. x ^ 0 = x (any number XOR 0 remains the same)
            ans ^= num;
        }
        
        // Return the unique number that doesn't have a duplicate
        return ans;
    }
}
