class Solution {
    public int titleToNumber(String columnTitle) {
        // Determine the length of the column title string
        int n = columnTitle.length();
        
        // Initialize the result variable to store the column number
        int ans = 0;
        
        // Iterate through each character in the column title
        for (int i = 0; i < n; i++) {
            // Alternative Approach:
            // Convert the character to its corresponding numeric value
            // Subtract 'A' (ASCII value 65) and add 1
            // For example:
            // 'A' - 'A' + 1 = 1
            // 'B' - 'A' + 1 = 2, and so on
            int c = columnTitle.charAt(i) - 'A' + 1;
            
            // Update the result by multiplying the current result by 26 (base-26 logic)
            // and adding the numeric value of the current character
            ans = 26 * ans + c;
        }
        
        // Return the final column number
        return ans;
    }
}
