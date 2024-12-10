class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();

        // If the number of rows is 1 or greater than or equal to the length of the string,
        // return the original string as no zigzag transformation is required.
        if (numRows == 1 || numRows >= n) {
            return s;
        }

        // Create an array of strings to hold characters for each row.
        String[] res = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = ""; // Initialize each row as an empty string.
        }

        int i = 0; // Pointer to traverse through the input string.

        // Loop until all characters are processed.
        while (i < n) {
            // Fill the characters in a downward direction (top to bottom).
            for (int j = 0; j < numRows && i < n; j++) {
                res[j] += s.charAt(i++); // Add the current character to the respective row.
            }

            // Fill the characters in a diagonal upward direction (bottom to top).
            for (int k = numRows - 2; k > 0 && i < n; k--) {
                res[k] += s.charAt(i++); // Add the current character to the respective row.
            }
        }

        String ans = ""; // To hold the final zigzag pattern string.

        // Combine all rows into a single string.
        for (String row : res) {
            ans += row;
        }

        return ans; // Return the zigzag pattern string.
    }
}
