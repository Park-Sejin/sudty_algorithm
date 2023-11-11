class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0, cnt = 0;
        
        for(int i = 1; cnt < 3; i++){
            for(int j = 0; j < rank.length; j++){
                if(rank[j] == i && attendance[j]){
                    if(cnt == 0){
                        answer += 10000 * j;
                    }
                    else if(cnt == 1){
                        answer += 100 * j;
                    }
                    else if(cnt == 2){
                        answer += j;
                    }
                        
                    cnt++;
                }
            }
        }
        
        
        return answer;
    }
}