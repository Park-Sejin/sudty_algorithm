import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] nums = new int[n+1];
        List<Integer> result = new ArrayList<>();
        
        for(int i = 2; i < nums.length; i++){
            if(nums[i] == 0 && n % i == 0){
                nums[i] = 1;
                result.add(i);
                
                for(int j = i; j < nums.length; j+=i){
                    nums[j] = 1;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}