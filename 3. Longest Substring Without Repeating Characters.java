// Approach 1: Using HashSet to find the length of the longest substring without repeating characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; // Variable to keep track of the maximum length found
        int left = 0; // Left pointer for the sliding window
        HashSet<Character> unique = new HashSet<>(); // Set to store unique characters
        
        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // While there is a duplicate character in the set
            while (unique.contains(s.charAt(right))) {
                unique.remove(s.charAt(left)); // Remove the leftmost character
                left++; // Move the left pointer to the right
            }
            unique.add(s.charAt(right)); // Add the current character to the set
            maxLength = Math.max(maxLength, right - left + 1); // Update max length
        }
        
        return maxLength; // Return the maximum length found
    }
}

// Approach 2: Using Array for Character Position Tracking
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; // Variable to keep track of the maximum length found
        int left = 0; // Left pointer for the sliding window
        int[] positionOfChar = new int[128]; // Array to track the last seen index of each character
        
        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right); // Current character
            
            // Move the left pointer to the right of the last seen index of the current character
            left = Math.max(positionOfChar[ch], left);
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
            // Update the last seen position of the current character
            positionOfChar[ch] = right + 1; 
        }
        
        return maxLength; // Return the maximum length found
    }
}
