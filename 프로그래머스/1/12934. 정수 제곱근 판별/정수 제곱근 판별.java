import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;
        
        if(Math.sqrt(n) % 1 == 0){
            long sqrt = (long) Math.sqrt(n) + 1;
            
            answer = sqrt * sqrt;
        }
        
        return answer;
    }
}