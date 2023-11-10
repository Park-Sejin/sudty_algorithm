import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 1;
        
        while(arr.length != 1 && arr.length > i){
            i *= 2;
        }
        
        return Arrays.copyOfRange(arr, 0, i);
    }
}