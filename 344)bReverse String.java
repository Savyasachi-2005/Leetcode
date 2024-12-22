class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers
        int left = 0;                // Pointer starting at the beginning of the array
        int right = s.length - 1;    // Pointer starting at the end of the array

        // Loop until the two pointers meet or cross
        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = s[left];     // Temporary variable to store the character at the left pointer
            s[left] = s[right];      // Assign the character at the right pointer to the left position
            s[right] = temp;         // Assign the stored character to the right position

            // Move the pointers closer to the center
            left++;
            right--;
        }
    }
}
