import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCnt = 0, cnt = 0;
        Boolean flag = false;
        
        Arrays.sort(array);
        
        int n = array[0];
        for(int i = 0; i < array.length; i++){
            if(n != array[i]){
                if(maxCnt < cnt){
                    answer = n;
                    maxCnt = cnt;
                }
                else if(maxCnt == cnt){
                    answer = -1;
                }
                
                cnt = 1;
                n = array[i];
            }
            else {
                cnt++;
                
                if(i == array.length-1){
                    if(maxCnt < cnt){
                        answer = n;
                    }
                    else if(maxCnt == cnt){
                        answer = -1;
                    }
                }
            }
        }
        
        return answer;
    }
}