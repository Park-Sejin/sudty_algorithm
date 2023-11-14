class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0], e = queries[i][1];
            String str = "";
            
            for(int j = e; j >= s; j--){
                str += answer.substring(j, j+1);
            }
            
            answer = answer.substring(0, s) + str + answer.substring(e+1);
        }
        
        return answer;
    }
}