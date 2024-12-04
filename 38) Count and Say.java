class Solution {
    public String countAndSay(int n) {
        // Handle invalid input (n should be >= 1)
        if (n <= 0) {
            return "";
        }
        
        // Initialize the sequence with the first term "1"
        String result = "1";
        
        // Generate the sequence iteratively up to the (n-1)th term
        for (int i = 0; i < n - 1; i++) {
            result = getN(result); // Get the next term in the sequence
        }
        
        // Return the nth term of the sequence
        return result;
    }

    private static String getN(String next) {
        // Use StringBuilder for efficient string concatenation
        StringBuilder nextStr = new StringBuilder();
        
        // Start with the first character in the current term
        char c = next.charAt(0);
        int count = 1; // Initialize the count of consecutive characters
        
        // Traverse the string from the second character onwards
        for (int i = 1; i < next.length(); i++) {
            if (next.charAt(i) == c) {
                // If the character matches the previous one, increment the count
                count++;
            } else {
                // If the character is different:
                // Append the count and the character to the result
                nextStr.append(count);
                nextStr.append(c);
                
                // Update the character and reset the count
                c = next.charAt(i);
                count = 1;
            }
        }
        
        // Append the count and character for the last group
        nextStr.append(count);
        nextStr.append(c);

        // Return the next term in the sequence as a string
        return nextStr.toString();
    }
}
