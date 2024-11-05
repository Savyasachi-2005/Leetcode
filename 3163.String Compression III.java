class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder(); // Initialize a StringBuilder to hold the result
        int count = 1; // Initialize count to keep track of consecutive characters
        
        // Loop through the string starting from the second character
        for (int i = 1; i < word.length(); i++) {
            // Check if the current character is different from the previous one
            if (word.charAt(i) != word.charAt(i - 1)) {
                // If the count exceeds 9, append '9' and the last character, then reset count
                if (count > 9) {
                    str.append('9'); // Append '9' to indicate the maximum count
                    str.append(word.charAt(i - 1)); // Append the character that was counted
                    count = 1; // Reset count for the new character
                } else {
                    // If count is 9 or less, append the count and the character
                    str.append(Integer.toString(count)); // Append the count
                    str.append(word.charAt(i - 1)); // Append the character that was counted
                    count = 1; // Reset count for the new character
                }
            } else {
                // If the current character is the same as the previous one, increment the count
                count++;
                // If count exceeds 9, append '9' and reset count
                if (count > 9) {
                    str.append('9'); // Append '9' to indicate the maximum count
                    str.append(word.charAt(i - 1)); // Append the character that was counted
                    count = 1; // Reset count for the next character
                }
            }
        }

        // After the loop, append the last character and its count
        if (count > 9) {
            str.append('9'); // Append '9' if count exceeds 9
            str.append(word.charAt(word.length() - 1)); // Append the last character
        } else {
            str.append(Integer.toString(count)); // Append the count of the last character
            str.append(word.charAt(word.length() - 1)); // Append the last character
        }

        return str.toString(); // Convert StringBuilder to String and return the result
    }
}
