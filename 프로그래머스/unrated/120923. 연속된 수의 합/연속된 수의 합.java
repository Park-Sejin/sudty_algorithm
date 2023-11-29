class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int s = total/num-num/2 + ((total%num == 0)? 0 : 1);
        
        for(int i = 0; i < num; i++){
            answer[i] = s++;
        }
        
        return answer;
    }
}