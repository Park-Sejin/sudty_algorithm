class Solution {
    public int solution(int[] common) {
        int a = common[common.length-1];
        int b = common[common.length-2];
        int c = common[common.length-3];
            
        if((a-b) == (b-c)){
            return a + (a-b);
        }
               
        return a * (a/b);
    }
}