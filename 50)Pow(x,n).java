class Solution {
    public double myPow(double x, int n) {
        // Base case: Any number raised to the power of 0 is 1
        if (n == 0) {
            return 1.00000;
        }

        // Handle negative exponents by converting them into positive
        // x^(-n) becomes 1 / x^n
        long A = n; // Use long to handle edge cases like Integer.MIN_VALUE
        if (A < 0) {
            x = 1 / x;
            A = -A;
        }

        // Recursively calculate x^(A/2)
        double again = myPow(x, (int) (A / 2));

        // If A is even, result is (x^(A/2))^2
        if (A % 2 == 0) {
            return again * again;
        } 
        // If A is odd, result is (x^(A/2))^2 * x
        else {
            return again * again * x;
        }
    }
}
