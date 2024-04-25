class Solution {
    public int solution(String s) {
        int answer = (s.indexOf("-") > -1)? -1 : 1;
            answer *= Integer.parseInt(s.replaceAll("\\D", ""));
        
        return answer;
    }
}