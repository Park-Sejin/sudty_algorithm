class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i < myString.length()-pat.length()+1; i++){
            int index = myString.indexOf(pat, i);
            
            if(index > -1){
                answer ++;
                
                i = index;
            }
        }
        
        return answer;
    }
}