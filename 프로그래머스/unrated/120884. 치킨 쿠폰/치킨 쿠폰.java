class Solution {
    public int solution(double chicken) {
        double answer = 0;
        
        while(chicken >= 0.1){
            chicken /= 10;
            answer += chicken;
        }
        
        return (int) answer;
    }
}