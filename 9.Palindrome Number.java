class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative or if x ends with 0 (and is not 0 itself), it cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false; 
        }

        // Variable to store the reversed half of the number
        int reverse = 0;

        // Reverse the digits of x until reverse is greater than or equal to x
        // This will only reverse half of the number, making it more efficient
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;  // Add the last digit of x to reverse
            x /= 10;                          // Remove the last digit from x
        }

        // Check if the original half (x) matches the reversed half
        // For even-length numbers, x should equal reverse
        // For odd-length numbers, ignore the middle digit by dividing reverse by 10
        return x == reverse || x == reverse / 10;
    }
}
