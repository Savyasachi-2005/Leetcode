class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length; // Get the length of the input array
        
        // Traverse the digits array from the last digit (rightmost) to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the result
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit
                return digits; // Return the modified array
            }
            digits[i] = 0; // If the digit is 9, set it to 0 (carry over)
        }

        // If we exit the loop, it means all digits were 9, so we need a new array
        int[] newDigits = new int[n + 1]; // Create a new array with one more digit
        
        newDigits[0] = 1; // Set the first digit to 1 (the carry over)
        return newDigits; // Return the new array
    }
}
