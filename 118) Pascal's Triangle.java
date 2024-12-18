import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create a list to store all rows of Pascal's Triangle
        List<List<Integer>> ans = new ArrayList<>();

        // Iterate through the number of rows to generate each row
        for (int i = 0; i < numRows; i++) {
            // Create a new list to represent the current row
            List<Integer> row = new ArrayList<>();

            // Add the first element of the row, which is always 1
            row.add(1);

            // Fill the intermediate values of the row (if applicable)
            for (int j = 1; j < i; j++) {
                // Each element is the sum of two elements from the previous row
                int value = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                row.add(value);
            }

            // Add the last element of the row, which is always 1 (for rows beyond the first)
            if (i > 0) {
                row.add(1);
            }

            // Add the completed row to the result
            ans.add(row);
        }

        // Return the complete Pascal's Triangle
        return ans;
    }
}
