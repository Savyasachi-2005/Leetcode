class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If the lengths of the two strings are different, they cannot be isomorphic.
        if (s.length() != t.length()) {
            return false;
        }
        
        int n = s.length();
        
        // Two hash maps to track character mappings from s -> t and t -> s.
        Map<Character, Character> ansS = new HashMap<>();
        Map<Character, Character> ansT = new HashMap<>();
        
        // Iterate through each character in the strings
        for (int i = 0; i < n; i++) {
            char charS = s.charAt(i); // Character from string s
            char charT = t.charAt(i); // Corresponding character from string t
            
            // Check the mapping from s -> t
            if (ansS.containsKey(charS)) {
                // If there is an existing mapping, ensure it matches the current character in t
                if (ansS.get(charS) != charT) {
                    return false; // Conflict in mapping
                }
            } else {
                // Add the mapping from charS to charT
                ansS.put(charS, charT);
            }
            
            // Check the mapping from t -> s
            if (ansT.containsKey(charT)) {
                // If there is an existing mapping, ensure it matches the current character in s
                if (ansT.get(charT) != charS) {
                    return false; // Conflict in mapping
                }
            } else {
                // Add the mapping from charT to charS
                ansT.put(charT, charS);
            }
        }
        
        // If no conflicts were found, the strings are isomorphic
        return true;
    }
}
