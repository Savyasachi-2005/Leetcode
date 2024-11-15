class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase to handle case insensitivity
        s = s.toLowerCase();
        
        // Initialize two pointers: left at the start, right at the end of the string
        int n = s.length();
        int left = 0, right = n - 1;
        
        // Continue looping until the left pointer is greater than or equal to the right pointer
        while (left < right) {
            
            // Skip non-alphanumeric characters from the left pointer
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // Skip non-alphanumeric characters from the right pointer
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters at the left and right pointers
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // If characters don't match, the string is not a palindrome
            }
            
            // Move both pointers towards the center
            left++;
            right--;
        }
        
        // If all characters match, return true, indicating the string is a palindrome
        return true;
    }
}
