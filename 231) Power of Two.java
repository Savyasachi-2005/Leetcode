class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base case: If n is exactly 1, return true (2^0 = 1 is a power of two)
        if (n == 1) return true;

        // If n is less than or equal to 0, it's not a power of two
        if (n <= 0) return false;

        // Check if n is divisible by 2 and recursively call the method with n / 2
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }
}
