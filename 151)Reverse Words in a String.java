class Solution {
    public String reverseWords(String s) {
        
        // Step 1: Trim leading and trailing spaces from the input string
        s = s.trim();

        // Step 2: Split the string into words using regex to handle multiple spaces
        String[] words = s.split("\\s+");

        // Step 3: Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Step 4: Iterate through the words array in reverse order
        int n = words.length;
        for (int i = n - 1; i >= 0; i--) {
            // Append each word to the result
            result.append(words[i]);
            
            // Add a space between words, except after the last word
            if (i != 0) {
                result.append(" ");
            }
        }

        // Step 5: Convert the StringBuilder to a string and return the result
        return result.toString();
    }
}
