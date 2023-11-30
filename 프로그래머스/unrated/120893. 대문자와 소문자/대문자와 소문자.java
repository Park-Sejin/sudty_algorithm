class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char ch : my_string.toCharArray()){
            String str = String.valueOf(ch);
            
            answer += (Character.isLowerCase(ch))? str.toUpperCase() : str.toLowerCase();
        }
        
        return answer;
    }
}