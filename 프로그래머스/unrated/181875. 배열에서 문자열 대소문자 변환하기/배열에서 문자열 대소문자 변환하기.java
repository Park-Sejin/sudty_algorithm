class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = strArr;
        
        for(int i = 0; i < strArr.length; i++){
            answer[i] = (i % 2 != 0)? answer[i].toUpperCase() : answer[i].toLowerCase();
        }
        
        return answer;
    }
}