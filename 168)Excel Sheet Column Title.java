class Solution {
    public String convertToTitle(int columnNumber) {
        // Initialize a StringBuilder to construct the resulting column title
        StringBuilder answer = new StringBuilder();

        // Loop until columnNumber becomes 0
        while (columnNumber > 0) {
            columnNumber--; // Decrement columnNumber to make it zero-based (align with 0-25 for 'A'-'Z')

            // Calculate the current character by taking the modulo 26 of columnNumber
            // Add 'A' to shift the value into the ASCII range of uppercase letters
            answer.append((char) (columnNumber % 26 + 'A'));

            // Update columnNumber by dividing it by 26 to move to the next "digit" in base-26
            columnNumber /= 26;
        }

        // Reverse the constructed string to get the correct column title
        return answer.reverse().toString();
    }
}
