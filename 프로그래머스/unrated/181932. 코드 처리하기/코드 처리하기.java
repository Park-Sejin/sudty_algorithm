class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int idx = 0;
        
        for(char ch : code.toCharArray()){
            if(mode == 0){
                if(ch == '1'){
                    mode = 1;
                }
                else if(idx%2 == 0){
                    answer += ch;
                } 
            }
            else {
                if(ch == '1'){
                    mode = 0;
                }
                else if(idx%2 != 0){
                    answer += ch;
                }
            }
            
            idx++;
        }
        
        return ("".equals(answer))? "EMPTY" : answer;
    }
}