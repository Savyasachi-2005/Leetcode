//This Question can be solved in two way one by using the Array and Two Pointers 
//And By using Hashset 
// But in My opinion the first method is better to use has it has high time complexity
// 1.method
class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize a pointer 'j' to track the position for the next unique element
        int j = 1;

        // Start iterating from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                // If it is different, place it at index 'j' and increment 'j'
                nums[j] = nums[i];
                j++;
            }
        }

        // Return the count of unique elements (which is 'j')
        return j;
    }
}
//2.method
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        int j = 0;  // Start from 0 to place unique elements at the beginning of the array

        for (int num : nums) {
            // Only add the number to nums if it's not already in the HashSet
            if (uniqueElements.add(num)) {
                nums[j] = num;  // Place the unique element at index j
                j++;            // Increment j to the next position
            }
        }
        
        return j;  // j is the count of unique elements
    }
}
