class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            int index = my_string.indexOf(ch+"");
            
            if(i == index){
                answer += ch;
            }
        }
        
        return answer;
    }
}