import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int s = (n == 1)? 0 : slicer[0];
        int e = (n == 2)? num_list.length-1 : slicer[1];
        List<Integer> list = new ArrayList<>();
        
        for(int i = s; i <= e; i++){
            if(n == 4 && (i % slicer[2]) != (s % slicer[2])){ continue; }
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}