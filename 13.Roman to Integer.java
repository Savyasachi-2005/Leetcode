class Solution {
    public int romanToInt(String s) {
        // Step 1: Create a HashMap to store Roman numeral symbols and their integer values
        HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
        roman.put('I', 1); // I = 1
        roman.put('V', 5); // V = 5
        roman.put('X', 10); // X = 10
        roman.put('L', 50); // L = 50
        roman.put('C', 100); // C = 100
        roman.put('D', 500); // D = 500
        roman.put('M', 1000); // M = 1000

        int sum = 0; // Variable to store the final integer value

        // Step 2: Loop through the Roman numeral string to calculate the sum
        for(int i = 0; i < s.length(); i++) {
            // Check if the current symbol is smaller than the next one
            // If it is, we subtract the current value (to handle cases like IV, IX)
            if (i + 1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum -= roman.get(s.charAt(i));
            }
            // Otherwise, simply add the value of the current symbol to the sum
            else {
                sum += roman.get(s.charAt(i));
            }
        }

        // Step 3: Return the calculated sum
        return sum;
    }
}
