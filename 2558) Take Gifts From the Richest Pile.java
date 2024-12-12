class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;

        // Step 1: Sort the array in ascending order
        Arrays.sort(gifts);

        // Step 2: Reverse the array to get it in descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = gifts[i];
            gifts[i] = gifts[n - i - 1];
            gifts[n - i - 1] = temp;
        }

        // Step 3: Initialize the sum as a long to handle large values
        long sum = 0;

        // Step 4: Perform the operation 'k' times
        for (int g = 0; g < k; g++) {
            // Replace the largest value (first element) with its square root
            gifts[0] = (int) Math.sqrt(gifts[0]);

            // Re-sort the array to maintain descending order
            Arrays.sort(gifts);

            // Reverse the sorted array to descending order
            for (int j = 0; j < n / 2; j++) {
                int temp = gifts[j];
                gifts[j] = gifts[n - j - 1];
                gifts[n - j - 1] = temp;
            }
        }

        // Step 5: Calculate the sum of all elements in the array
        for (int a : gifts) {
            sum += a; // Accumulate each value into sum
        }

        // Step 6: Return the total sum
        return sum;
    }
}
