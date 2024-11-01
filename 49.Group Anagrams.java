import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    // To store the final list of anagram groups
    private List<List<String>> ans;

    public List<List<String>> groupAnagrams(String[] strs) {
        // Return an instance of an anonymous inner class that extends AbstractList
        return new AbstractList<List<String>>() {
            // Method to get the anagram group at the specified index
            public List<String> get(int index) {
                // Initialize ans if it is null (first call)
                if (ans == null) init(); 
                return ans.get(index); // Return the anagram group at the specified index
            }

            // Method to get the size of the list of anagram groups
            public int size() {
                // Initialize ans if it is null (first call)
                if (ans == null) init(); 
                return ans.size(); // Return the number of anagram groups
            }

            // Method to initialize the ans list
            public void init() {
                // Map to group anagrams by their frequency signature (character counts)
                Map<String, List<String>> group = new HashMap<>();
                
                // Loop through each string in the input array
                for (String a : strs) {
                    // Array to count occurrences of each letter (for 'a' to 'z')
                    int[] count = new int[26]; 
                    StringBuffer stringBuffer = new StringBuffer(); // StringBuffer to construct the key

                    // Count each character in the current string
                    for (char b : a.toCharArray()) {
                        count[b - 'a']++; // Increment count for the character (b - 'a' gives the index)
                    }

                    // Construct a key based on character counts
                    for (int i = 0; i < 26; i++) {
                        // If the character appears at least once, add it to the key
                        if (count[i] != 0) {
                            stringBuffer.append((char) ('a' + i)); // Append the character
                            stringBuffer.append(count[i]); // Append the count of the character
                        }
                    }

                    // Get the constructed key
                    String key = stringBuffer.toString();
                    // Group strings by the constructed key
                    group.computeIfAbsent(key, k -> new ArrayList<String>()).add(a);
                    // If the key does not exist, create a new list and add the string
                }

                // Store the grouped anagrams as a list of lists
                ans = new ArrayList<>(group.values());
                // Convert the values of the map (groups of anagrams) to a list
            }
        };
    }
}
