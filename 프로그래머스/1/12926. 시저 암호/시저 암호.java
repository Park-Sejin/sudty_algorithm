class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                ch = (char)(ch+n);
                
                if(!Character.isUpperCase(ch)){
                    ch -= 26;
                }
            }
            else if(Character.isLowerCase(ch)){
                ch = (char)(ch+n);
                
                if(!Character.isLowerCase(ch)){
                    ch -= 26;
                }
            }
            
            answer += ch;
        }
        
        return answer;
    }
}