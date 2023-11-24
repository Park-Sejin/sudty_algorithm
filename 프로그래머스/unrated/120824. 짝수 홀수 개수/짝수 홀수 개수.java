class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int num : num_list){
            int i = (num % 2 == 0)? 0 : 1;
            
            answer[i] += 1;
        }
        
        return answer;
    }
}