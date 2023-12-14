class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        
        for(int i = 0; i < numbers.length; i++){
            if("right".equals(direction)){
                idx = (i == numbers.length-1)? 0 : i+1;
            }
            else {
                idx = (i == 0)? numbers.length-1 : i-1;
            }
            
            answer[idx] = numbers[i];
        }
        
        return answer;
    }
}