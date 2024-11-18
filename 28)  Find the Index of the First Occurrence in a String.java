class Solution {
    public int strStr(String haystack, String needle) {
        // Get the lengths of the haystack and needle strings
        int hayLen = haystack.length();
        int neeLen = needle.length();
        
        // Edge case: If the needle is an empty string, return 0
        if (neeLen == 0) {
            return 0;
        }

        // Loop through the haystack up to the point where the remaining
        // portion is at least as long as the needle
        for (int i = 0; i <= hayLen - neeLen; i++) {
            int j = 0;

            // Compare each character of the needle with the corresponding
            // characters in the haystack
            while (j < neeLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++; // Increment j if characters match
            }

            // If all characters of the needle are matched (j == neeLen),
            // return the starting index of the match in the haystack
            if (j == neeLen) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
