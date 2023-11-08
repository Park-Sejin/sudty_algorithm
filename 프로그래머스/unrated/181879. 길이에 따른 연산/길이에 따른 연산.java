class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length > 10)? 0 : 1;
        
        for(int number : num_list){
            answer = (num_list.length > 10)? answer + number : answer * number;
        }
        
        return answer;
    }
}