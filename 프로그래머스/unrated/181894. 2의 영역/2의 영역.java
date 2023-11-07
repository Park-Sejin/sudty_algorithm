import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[] { -1 };
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                list.add(i);
            }
        }
        
        if(list.size() == 1){
            answer[0] = arr[list.get(0)];
        }
        else if(list.size() > 0){
            int s = list.get(0);
            int e = list.get(list.size()-1);
            answer = new int[e-s+1];
            
            int i = 0;
            for(int j = s; j <= e; j++){
                answer[i++] = arr[j];
            }
        }
        
        return answer;
    }
}