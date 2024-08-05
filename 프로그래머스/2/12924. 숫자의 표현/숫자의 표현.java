class Solution {
    public int solution(int n) {
        int answer = 0;
        int s = 1, sum = 0;
        
        for(int i = 1; i <= n; i++){
            sum += i;
            
            while(sum >= n){
                if(sum == n){
                    answer++;
                }
                
                sum = sum - s++;
            }
        }
        
        return answer;
    }
}