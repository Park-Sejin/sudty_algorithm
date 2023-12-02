class Solution {
    public int solution(String A, String B) {
        String result = "";
        int answer = 0;
        
        for(int i = A.length(); i >= 0; i--){
            result = A.substring(i) + A.substring(0, i);
            
            if(B.equals(result)){
                return answer;
            }
            answer++;
        }
        
        return -1;
    }
}