class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length; // Get the length of the input array.
        
        // Convert each number in the array to its string representation.
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // Sort the string array using a custom comparator.
        // The comparator ensures that the concatenation of two strings `b+a`
        // is compared with `a+b`. This helps in determining which order forms a larger number.
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        // Use StringBuilder to efficiently build the result string.
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        // Convert the StringBuilder to a string and check for leading "0".
        // If the result starts with "0" (e.g., all inputs were zero), return "0".
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}
