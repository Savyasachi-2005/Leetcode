class Solution {
    public String longestPalindrome(String s) {
        // Get the length of the input string
        int n = s.length();
        
        // If the string has less than 2 characters, return it as it is already a palindrome
        if (n < 2) {
            return s;
        }
        
        // Variables to track the starting index and maximum length of the longest palindrome
        int initial = 0; // Starting index of the longest palindrome
        int maxLength = 0; // Length of the longest palindrome found so far
        
        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            // Initialize pointers for expansion
            int left = i;  // Left pointer starts at the current index
            int right = i; // Right pointer starts at the current index
            
            // Handle even-length palindromes
            // Expand the right pointer if the current character equals the next character
            while (right < n - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
            }
            
            // Handle odd-length palindromes
            // Expand outward while the characters at left and right pointers are equal
            while (left > 0 && right < n - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;  // Move left pointer one step to the left
                right++; // Move right pointer one step to the right
            }
            
            // Calculate the current palindrome's length
            int curLen = right - left + 1;
            
            // Update the longest palindrome if the current length is greater than the max length found so far
            if (curLen > maxLength) {
                maxLength = curLen; // Update max length
                initial = left;     // Update starting index of the palindrome
            }
        }
        
        // Extract and return the longest palindrome substring using the starting index and length
        return s.substring(initial, initial + maxLength);
    }
}
