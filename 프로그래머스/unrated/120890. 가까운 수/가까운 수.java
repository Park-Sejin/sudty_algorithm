import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int diff = 0;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > n || i == array.length-1){
                if(i == 0 || diff > array[i]-n){
                    return array[i];
                }
                else {
                    return array[i-1];
                }
            }
            
            diff = n - array[i];
        }
        
        return -1;
    }
}