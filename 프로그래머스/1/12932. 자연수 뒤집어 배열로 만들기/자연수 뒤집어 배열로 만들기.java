class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int i = 0;
        
        while(n > 0) {
            answer[i++] = Long.valueOf(n%10).intValue();
            n /= 10;
        }
        
        return answer;
    }
}