class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            String str = myString.substring(i, i+1);
            
            answer += ("A,a".indexOf(str) > -1)? str.toUpperCase() : str.toLowerCase();
        }
        
        return answer;
    }
}