class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        
        for(char ch : pat.toCharArray()){
            str += (ch == 'A')? "B" : "A";
        }
        
        int answer = (myString.indexOf(str) > -1)? 1 : 0;
        
        return answer;
    }
}