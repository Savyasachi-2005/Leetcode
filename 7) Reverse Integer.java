class Solution {
    public int reverse(int x) {
        // Initialize variable to store the reversed number
        int rev = 0;
        int n = x; // Copy of the input number to process
        
        // Continue reversing until all digits of n are processed
        while (n != 0) {
            // Extract the last digit of n
            int dig = n % 10;
            
            // Remove the last digit from n
            n /= 10;
            
            // Check for overflow: if rev is greater than the max value of 32-bit integer
            // or if rev is equal to the max value and the current digit is greater than 7,
            // it will overflow.
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && dig > 7)) {
                return 0; // Return 0 if overflow occurs
            }
            
            // Check for underflow: if rev is less than the min value of 32-bit integer
            // or if rev is equal to the min value and the current digit is less than -8,
            // it will underflow.
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && dig < -8)) {
                return 0; // Return 0 if underflow occurs
            }
            
            // Append the digit to the reversed number (multiply rev by 10 and add the digit)
            rev = rev * 10 + dig;
        }
        
        // Return the final reversed number
        return rev;
    }
}
