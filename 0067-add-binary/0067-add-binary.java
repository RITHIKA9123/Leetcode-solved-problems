import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger decimal1=new BigInteger(a,2);
        BigInteger decimal2=new BigInteger(b,2);
        BigInteger res=decimal1.add(decimal2);
        return res.toString(2); 
    }
}