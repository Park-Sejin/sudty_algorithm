class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split("\\D");
        
        int answer = 0;
        
        for(String str : split){
            if(!"".equals(str)){
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}