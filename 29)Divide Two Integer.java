class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the overflow case where dividend is Integer.MIN_VALUE and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow occurs, return the max value
        }

        // Handle the case when both dividend and divisor are equal
        if (dividend == divisor) {
            return 1; // If both are equal, the division result is 1
        }

        // Determine the sign of the result
        boolean sign = (dividend > 0) == (divisor > 0); // True if both are of the same sign, false if opposite

        // Convert both dividend and divisor to their absolute values and use long to avoid overflow
        long a = Math.abs((long) dividend); // Absolute value of dividend
        long b = Math.abs((long) divisor); // Absolute value of divisor
        long ans = 0; // Initialize the result variable

        // Perform division using bit shifting to efficiently calculate the quotient
        while (a >= b) { // While dividend is greater than or equal to divisor
            long cnt = 0;
            
            // Find the largest multiple of divisor that fits into the dividend
            while (a >= (b << (cnt + 1))) { // Left shift the divisor (b) and check if it fits into dividend
                cnt++;
            }

            // Add the multiple of the divisor to the result
            ans += 1L << cnt; // Add 2^cnt to the result (this represents the current multiple of the divisor)

            // Subtract the multiple of divisor from the dividend
            a -= b << cnt; // Update dividend by removing the multiple
        }

        // Apply the sign to the result (positive or negative)
        ans = sign ? ans : -ans;

        // Handle cases where the result exceeds the integer range
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE; // If the result exceeds max value, return Integer.MAX_VALUE
        }
        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE; // If the result is less than min value, return Integer.MIN_VALUE
        }

        // Return the result as an integer
        return (int) ans;
    }
}
