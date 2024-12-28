class Solution {
    // Main method to determine if a number is a happy number
    public boolean isHappy(int n) {
        // Set to store numbers encountered during the process to detect cycles
        Set<Integer> ans1 = new HashSet<>();
        
        // Continue the process until n becomes 1 (happy) or a cycle is detected
        while (n != 1 && !ans1.contains(n)) {
            // Add the current number to the set
            ans1.add(n);
            
            // Compute the next number in the sequence
            n = getNext(n);
        }
        
        // If n equals 1, it's a happy number; otherwise, it's not
        return n == 1;
    }

    // Helper method to calculate the sum of the squares of digits of a number
    private int getNext(int n) {
        int totalSum = 0; // Variable to store the sum of squares
        
        // Process each digit of the number
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            totalSum += digit * digit; // Add the square of the digit to the sum
            n /= 10; // Remove the last digit
        }
        
        // Return the computed sum
        return totalSum;
    }
}
