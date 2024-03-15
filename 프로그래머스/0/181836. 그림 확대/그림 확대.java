class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int i = 0;
        for(String str : picture){
            String result = "";
            
            for(char ch : str.toCharArray()){
                for(int j = 0; j < k; j++){
                    result += ch;
                }
            }
            
            for(int j = 0; j < k; j++){
                answer[i++] = result;
            }
            
        }
        
        return answer;
    }
}