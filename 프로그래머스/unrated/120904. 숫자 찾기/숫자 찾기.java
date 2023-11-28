class Solution {
    public int solution(int num, int k) {
        int index = (""+num).indexOf(""+k);
        
        return (index > -1)? index+1 : index;
    }
}