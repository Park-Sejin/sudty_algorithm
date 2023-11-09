import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("^x+", "").replaceAll("x+", "x").split("x");
        
        Arrays.sort(answer);
        
        return answer;
    }
}