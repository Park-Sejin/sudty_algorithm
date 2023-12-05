import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] strings = my_string.replaceAll("[^0-9]", "").split("");
        int[] answer = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}