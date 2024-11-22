class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert the first string to a character array
        char[] arr1 = s.toCharArray();
        
        // Convert the second string to a character array
        char[] arr2 = t.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare the sorted arrays; if they are equal, t is an anagram of s
        return Arrays.equals(arr1, arr2);
    }
}
