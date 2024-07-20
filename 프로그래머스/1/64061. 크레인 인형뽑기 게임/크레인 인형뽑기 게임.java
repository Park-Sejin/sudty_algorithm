import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int[] loc = new int[board.length];
        int answer = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[j][i] != 0){
                    loc[i] = j;
                    break;
                }
            }
        }
        
        for(int m : moves){
            if(loc[m-1] == board.length){ continue; }
            int num = board[loc[m-1]][m-1];
            
            if(!stack.isEmpty() && stack.peek() == num){
                stack.pop();
                answer+=2;
            }
            else if(num != 0){
                stack.push(num);
            }
            
            loc[m-1]++;
        }
        
        return answer;
    }
}