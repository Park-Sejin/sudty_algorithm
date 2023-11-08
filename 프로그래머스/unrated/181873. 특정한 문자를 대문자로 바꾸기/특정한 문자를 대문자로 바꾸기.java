class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            String str = my_string.substring(i, i+1);
            answer += (alp.equals(str))? str.toUpperCase() : str.toLowerCase();
        }
        
        return answer;
    }
}