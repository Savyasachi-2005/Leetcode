import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        HashSet<Integer> res = new HashSet<>();
        
        // Iterate through each number in the array
        for (int num : nums) {
            // Check if the number is already in the HashSet
            if (res.contains(num)) {
                return true; // Duplicate found
            }
            // Add the number to the HashSet
            res.add(num);
        }
        
        // No duplicates were found
        return false;
    }
}
