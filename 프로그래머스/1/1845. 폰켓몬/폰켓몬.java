import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> type = new HashSet<>();
        int answer = 0;
        int count = nums.length/2;
        
        for(int num : nums){
            type.add(num);
        }
        
        answer = (count < type.size())? count : type.size();
        
        return answer;
    }
}