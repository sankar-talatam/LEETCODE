import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger d1 = new BigInteger(a, 2);
        BigInteger d2 = new BigInteger(b, 2);
        BigInteger sum = d1.add(d2);

        // Convert the sum back to a binary string
        String result = sum.toString(2);

        return result;
    }
}