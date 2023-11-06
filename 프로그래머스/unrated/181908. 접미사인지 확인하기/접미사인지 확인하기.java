class Solution {
    public int solution(String my_string, String is_suffix) {
        int my_len = my_string.length();
        int is_len = is_suffix.length();
        
        int len = (my_len > is_len)? my_len - is_len : 0;
        int answer = is_suffix.equals(my_string.substring(len))? 1: 0;
        
        
        return answer;
    }
}