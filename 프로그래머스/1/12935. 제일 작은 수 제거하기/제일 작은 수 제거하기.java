class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        int i = 0;
        for(int num : arr){
            if(num == min){
                continue;
            }
            answer[i++] = num;
        }
        
        return answer;
    }
}