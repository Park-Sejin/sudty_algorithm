class Solution {
    public long solution(long n) {
        long answer = 0;
        int[] arr = new int[10];
        
        for(String s : Long.toString(n).split("")){
            int idx = Integer.parseInt(s+"");
            arr[idx]++;
        }
        
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < arr[i]; j++){
                answer = (answer * 10)+i;
            }
        }
        
        return answer;
    }
}