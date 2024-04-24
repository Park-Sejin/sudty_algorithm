import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> persons = new HashMap<>();
        
        for(String str : participant){
            persons.put(str, persons.getOrDefault(str, 0) + 1);
        }
        
        for(String str : completion){
            int cnt = persons.get(str);
            
            if(cnt == 1){
                persons.remove(str);
            }
            else {
                persons.put(str, cnt-1);
            }
        }
        
        for(String key : persons.keySet()){
            answer = key;
        }
        
        return answer;
    }
}