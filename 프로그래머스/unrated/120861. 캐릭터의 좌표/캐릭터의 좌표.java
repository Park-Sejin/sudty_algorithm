class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = board[0]/2, height = board[1]/2;
        
        for(String key : keyinput){
            if("up".equals(key) && answer[1] < height){
                answer[1] += 1;
            }
            else if("down".equals(key) && answer[1] > height*-1){
                answer[1] -= 1;
            }
            else if("right".equals(key) && answer[0] < width){
                answer[0] += 1;
            }
            else if("left".equals(key) && answer[0] > width*-1){
                answer[0] -= 1;
            }
        }
        
        return answer;
    }
}