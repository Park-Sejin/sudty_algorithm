import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("^[a-c]+", "").split("[a-c]+");
        
       if("".equals(answer[0])){
           answer[0] = "EMPTY";
       }
        
        return answer;
    }
}