class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        for(char ch : s.toUpperCase().toCharArray()){
            cnt += (ch == 'P')? 1 : ((ch == 'Y')? -1 : 0);
        }
        
        if(cnt != 0){
            return false;
        }

        return answer;
    }
}