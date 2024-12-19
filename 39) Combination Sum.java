class Solution {
    // Recursive function to generate all possible combinations
    private void allPossibleComb(int index, int[] array, int target, List<List<Integer>> answer, List<Integer> tempList) {
        // Base case: if index reaches the end of the array
        if (index == array.length) {
            // Check if the current combination sums up to the target
            if (target == 0) {
                // Add a deep copy of the current combination to the answer list
                answer.add(new ArrayList<>(tempList));
            }
            return;
        }
        // Include the current element if it does not exceed the target
        if (array[index] <= target) {
            tempList.add(array[index]); // Add the element to the current combination
            // Recurse with the same index, reducing the target by the current element
            allPossibleComb(index, array, target - array[index], answer, tempList);
            tempList.remove(tempList.size() - 1); // Backtrack to explore other combinations
        }
        // Exclude the current element and move to the next index
        allPossibleComb(index + 1, array, target, answer, tempList);
    }

    // Main function to find all unique combinations that sum to the target
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>(); // List to store all combinations
        allPossibleComb(0, candidates, target, ans, new ArrayList<>()); // Start the recursion
        return ans; // Return the result
    }
}
