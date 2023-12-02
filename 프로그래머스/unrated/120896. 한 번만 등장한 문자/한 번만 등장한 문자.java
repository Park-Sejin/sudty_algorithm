import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(char ch : s.toCharArray()){
            if(s.indexOf(ch, s.indexOf(ch)+1) == -1){
                answer += ch;
            }
        }
        
        char[] strs = answer.toCharArray();
        Arrays.sort(strs);
        
        return new String(strs);
    }
}