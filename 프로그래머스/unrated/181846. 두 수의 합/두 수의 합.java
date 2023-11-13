import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger number1 = new BigInteger(a);
        BigInteger number2 = new BigInteger(b);
        
        return number1.add(number2).toString();
    }
}