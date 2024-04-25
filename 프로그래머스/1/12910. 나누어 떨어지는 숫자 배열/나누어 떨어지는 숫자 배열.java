import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {-1};
        
        for(int num : arr){
            if(num%divisor == 0){
                list.add(num);
            }
        }
        
        if(list.size() != 0){
            answer = new int[list.size()];
            
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
            
            Arrays.sort(answer);
        }
        
        return answer;
    }
}