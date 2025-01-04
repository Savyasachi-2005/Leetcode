//Approach 1: Using Separate Loops for Each Factor
class Solution {
    public boolean isUgly(int n) {
        // Edge case: Non-positive numbers are not ugly
        if (n <= 0) {
            return false;
        }

        // Divide n by 2, 3, and 5 as long as it is divisible by them
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        // If n is reduced to 1, it's an ugly number
        return n == 1;
    }
}

//Approach 2: Optimized Loop Over Factors

class Solution {
    public boolean isUgly(int n) {
        // Edge case: Non-positive numbers are not ugly
        if (n <= 0) {
            return false;
        }

        // Iterate over the prime factors 2, 3, and 5
        for (int i = 2; i < 6 && n > 0; i++) {
            while (n % i == 0) {
                n /= i;
            }
        }

        // If n is reduced to 1, it's an ugly number
        return n == 1;
    }
}
