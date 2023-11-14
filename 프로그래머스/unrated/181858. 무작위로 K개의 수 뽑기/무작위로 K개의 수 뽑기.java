import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            Boolean flag = true;
            
            for(int j = 0; j < list.size(); j++){
                if(list.get(j) == arr[i]){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                list.add(arr[i]);
            }
        }
        
        if(k > list.size()){
            while(k > list.size()){
                list.add(-1);
            }
        }
        
        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}