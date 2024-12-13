class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if the lengths of the two strings are different.
        // If they are, 'goal' cannot be a rotation of 's'.
        if (s.length() != goal.length()) {
            return false; // Return false immediately if lengths don't match.
        }

        // Concatenate 's' with itself. This allows us to check all possible rotations
        // of 's' in a single pass using the 'contains' method.
        return (s + s).contains(goal); // Check if 'goal' is a substring of 's + s'.
    }
}
