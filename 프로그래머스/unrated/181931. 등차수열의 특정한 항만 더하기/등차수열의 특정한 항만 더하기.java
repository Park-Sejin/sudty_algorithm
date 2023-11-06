class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int addNum = a;
        
        for(Boolean include : included){
            answer += (include)? addNum : 0;
            addNum += d;
        }
        
        return answer;
    }
}