class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for(int i = 1; i < dots.length; i++){
            int a = (i == 1)? 2 : 1;
            int b = (i == 3)? 2 : 3;
            
            double x1 = Math.abs(dots[0][0]-dots[i][0]);
            double x2 = Math.abs(dots[a][0]-dots[b][0]);
            double y1 = Math.abs(dots[0][1]-dots[i][1]);
            double y2 = Math.abs(dots[a][1]-dots[b][1]);
            
            if(x1 / y1 == x2 / y2){
                return 1;
            }
        }
        
        return answer;
    }
}