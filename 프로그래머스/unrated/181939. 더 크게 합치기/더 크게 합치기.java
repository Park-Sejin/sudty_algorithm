class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.parseInt("" + a + b);
        int result2 = Integer.parseInt("" + b + a);
        int answer = (result1 > result2)? result1 : result2;
        
        return answer;
    }
}