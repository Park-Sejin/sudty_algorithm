class Solution {
    public String solution(int n) {
        String answer = "";
        String[] chars = {"수", "박"};
        
        for(int i = 0; i < n; i++){
            answer += chars[i%2];
        }
        
        return answer;
    }
}