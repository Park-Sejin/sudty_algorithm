class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        while(true){
            if(b % 5 == 0) {
                b /= 5;
            }
            else if(b % 2 == 0){
                b /= 2;
            }
            else {
                break;
            }
        }
        
        return (a % b == 0)? 1 : 2;
    }
}