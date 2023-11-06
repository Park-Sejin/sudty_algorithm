class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        int i = 0;
        for(int j = k; j <= n; j+=k){
            answer[i++] = j;
        }
        
        return answer;
    }
}