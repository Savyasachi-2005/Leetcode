import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert the first binary string 'a' into a BigInteger with base 2
        BigInteger num1 = new BigInteger(a, 2);

        // Convert the second binary string 'b' into a BigInteger with base 2
        BigInteger num2 = new BigInteger(b, 2);

        // Add the two BigInteger numbers
        BigInteger sum = num1.add(num2);

        // Convert the result back to a binary string representation (base 2)
        return sum.toString(2);
    }
}
