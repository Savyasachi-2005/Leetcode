class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Get the number of strings in the array
        int n = strs.length;
        
        // StringBuilder to store the common prefix
        StringBuilder res = new StringBuilder();
        
        // Loop through each character of the first string (strs[0])
        for (int i = 0; i < strs[0].length(); i++) {
            // Get the current character in the first string
            char curChar = strs[0].charAt(i);
            
            // Check if this character exists in all other strings at the same index
            for (int j = 1; j < n; j++) {
                // If the index is out of bounds for any string or characters do not match
                if (i >= strs[j].length() || strs[j].charAt(i) != curChar) {
                    // Return the result up to this point (common prefix found so far)
                    return res.toString();
                }
            }
            // Append the current character to the result string
            res.append(curChar);
        }
        
        // If the loop completes without finding a mismatch, return the entire common prefix
        return res.toString();
    }
}
