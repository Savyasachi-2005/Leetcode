class Solution {
    public int myAtoi(String s) {
        s = s.strip();  // Remove leading and trailing whitespaces
        int n = s.length();
        if (n == 0) return 0;

        int i = 0;
        int sign = 1;

        // Handle optional '+' or '-' sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // Skip leading zeros
        while (i < n && s.charAt(i) == '0') {
            i++;
        }

        // Extract digits and build the result
        StringBuilder res = new StringBuilder();
        while (i < n && Character.isDigit(s.charAt(i))) {
            res.append(s.charAt(i));
            i++;
        }

        // Handle edge case: no digits
        if (res.length() == 0) return 0;

        // Clamp the result if it's too large
        String resultStr = res.toString();
        if (resultStr.length() > 10) { // Length greater than max int representation
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // Convert to a number and handle overflow
        long result = 0;
        for (int j = 0; j < resultStr.length(); j++) {
            result = result * 10 + (resultStr.charAt(j) - '0');
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) (sign * result);
    }
}
