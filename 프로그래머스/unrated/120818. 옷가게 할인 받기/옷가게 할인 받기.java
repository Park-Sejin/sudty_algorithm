class Solution {
    public int solution(int price) {
        int answer = 0;
        
        switch(price/100000){
            case 0 : answer = price; break;
            case 1 : 
            case 2 : answer = price * 95 / 100; break;
            case 3 : 
            case 4 : answer = price * 90 / 100;break;
            default : answer = price * 80 / 100; break;
        }
        
        return answer;
    }
}