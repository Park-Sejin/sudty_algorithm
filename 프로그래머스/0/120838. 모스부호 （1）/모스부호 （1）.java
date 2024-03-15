import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] strs = letter.split(" ");
        String[] words = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
               "...","-","..-","...-",".--","-..-","-.--","--.."
            };
        
        for(String str : strs){
            int i = Arrays.asList(words).indexOf(str);
            
            answer += Character.toString(i+97);
        }
        
        
        return answer;
    }
}