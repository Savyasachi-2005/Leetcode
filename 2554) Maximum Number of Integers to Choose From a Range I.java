class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // Create a HashSet to store banned numbers for fast lookup
        HashSet<Integer> newSet = new HashSet<>();

        // Populate the HashSet with the banned numbers
        for (int i : banned) {
            newSet.add(i);
        }

        // Initialize variables to track the sum of chosen integers and their count
        int sum = 0;
        int count = 0;

        // Iterate through numbers in the range [1, n]
        for (int i = 1; i <= n; i++) {
            // Skip the current number if it's in the banned set
            if (newSet.contains(i)) {
                continue;
            }
            // Stop the loop if adding the current number exceeds maxSum
            if (sum + i > maxSum) {
                break;
            }
            // Add the current number to the sum and increment the count
            sum += i;
            count++;
        }

        // Return the total count of chosen integers
        return count;
    }
}
