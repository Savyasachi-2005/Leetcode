class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store the ASCII sum of characters in each string
        int sum1 = 0; // Sum of characters in string s
        int sum2 = 0; // Sum of characters in string t

        // Calculate the sum of ASCII values of characters in string s
        for (char i : s.toCharArray()) {
            sum1 += i; // Add ASCII value of each character to sum1
        }

        // Calculate the sum of ASCII values of characters in string t
        for (char j : t.toCharArray()) {
            sum2 += j; // Add ASCII value of each character to sum2
        }

        // The difference between sum2 and sum1 gives the ASCII value of the extra character
        return (char) (sum2 - sum1); // Convert the difference back to a character
    }
}
