class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int n : array){
            String str = n + "";
            
            for(char ch : str.toCharArray()){
                if(ch == '7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}