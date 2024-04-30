import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        else if(!s.matches("^[\\d]*$")){
            return false;
        }
        
        return answer;
    }
}