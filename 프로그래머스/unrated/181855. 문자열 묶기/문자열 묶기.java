class Solution {
    public int solution(String[] strArr) {
        int[] result = new int[30];
        int answer = 0;
        
        for(int i = 0; i < strArr.length; i++){
            int len = strArr[i].length();
            result[len-1] += 1;
            
            answer = Math.max(answer, result[len-1]);
        }
        
        return answer;
    }
}