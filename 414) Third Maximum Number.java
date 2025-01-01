class Solution {
    public int thirdMax(int[] nums) {
        // Create a TreeSet to store unique elements in sorted order
        TreeSet<Integer> ans = new TreeSet<>();
        
        // Add each element from the input array to the TreeSet
        for (int i : nums) {
            ans.add(i);
        }
        
        // If there are fewer than 3 distinct elements, return the largest one
        if (ans.size() < 3) {
            return ans.last();  // Return the largest element
        }
        
        // Remove the largest element (last element) twice
        ans.pollLast();  // Remove the largest element
        ans.pollLast();  // Remove the second largest element
        
        // The third largest element is now the last remaining element
        return ans.last();  // Return the third maximum element
    }
}
