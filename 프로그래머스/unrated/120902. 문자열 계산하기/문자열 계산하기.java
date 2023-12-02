class Solution {
    public int solution(String my_string) {
        String[] strs = my_string.split(" ");
        int answer = 0;
        
        for(int i = 0; i < strs.length; i+=2){
            if(i == 0 || "+".equals(strs[i-1])){
                answer += Integer.parseInt(strs[i]);
            }
            else {
                answer -= Integer.parseInt(strs[i]);
            }
        }
        
        return answer;
    }
}