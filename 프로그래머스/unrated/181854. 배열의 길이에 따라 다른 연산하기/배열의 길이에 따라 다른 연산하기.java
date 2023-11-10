class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        
        int init = (arr.length % 2 == 0)? 1 : 0;
        for(int i = init; i < arr.length; i += 2){
            answer[i] += n;
        }
        
        return answer;
    }
}