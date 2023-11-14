import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = i+"";
            Boolean flag = true;
                
            for(char ch : str.toCharArray()){
                if(ch != '0' && ch != '5'){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}