import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger valueA = new BigInteger(a);
        BigInteger valueB = new BigInteger(b);        
        return valueA.add(valueB).toString();
    }
}