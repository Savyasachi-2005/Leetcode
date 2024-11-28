class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;  // Initialize the counter to track the number of jewels in stones
        
        // Outer loop to iterate through each jewel in the 'jewels' string
        for (int i = 0; i < jewels.length(); i++) {
            
            // Inner loop to compare the current jewel with each stone
            for (int j = 0; j < stones.length(); j++) {
                
                // If a match is found, increment the count
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        
        return count;  // Return the total count of jewels found in stones
    }
}
