import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        int j = 0;
        
        Arrays.sort(indices);
        
        for(int i = 0; i < my_string.length(); i++){
            if(j != indices.length && i == indices[j]){
                j++;
                continue;
            }
            
            answer += str[i];
        }
        
        return answer;
    }
}