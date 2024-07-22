class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        
        for(char ch : s.toCharArray()){
            String str = Character.toString(ch);
            answer += (idx++%2 == 0)? str.toUpperCase() : str.toLowerCase();
            
            if(" ".equals(str)){
                idx = 0;
            }
        }
        
        return answer;
    }
}