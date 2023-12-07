class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(char ch : my_string.toCharArray()){
            if(ch >= 49 && ch <= 59){
                answer += Character.getNumericValue(ch);
            }
        }
        
        return answer;
    }
}