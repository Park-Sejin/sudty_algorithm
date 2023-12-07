class Solution {
    public int solution(int[][] dots) {
        int minWidth = 256, maxWidth = -256;
        int minHeight = 256, maxHeight = -256;
        
        for(int i = 0; i < dots.length; i++){
            minWidth = Math.min(minWidth, dots[i][0]);
            maxWidth = Math.max(maxWidth, dots[i][0]);
            
            minHeight = Math.min(minHeight, dots[i][1]);
            maxHeight = Math.max(maxHeight, dots[i][1]);
        }
        
        return (maxWidth-minWidth) * (maxHeight-minHeight);
    }
}