class Solution {
    public int solution(int balls, int share) {
        double answer = fac(balls, balls-share) / fac(share, 1);
        
        return (int) answer;
    }
    
    double fac(int num, int min) {
        if(num == min){
            return 1;
        }
        
        return num * fac(num-1, min);
    }
}