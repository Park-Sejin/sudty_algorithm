class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(String str : str_list){
            answer += (str.indexOf(ex) > -1)? "" : str;
        }
        
        return answer;
    }
}