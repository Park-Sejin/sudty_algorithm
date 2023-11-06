class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result_mul = 1;
        int result_add = 0;
        
        for(int num : num_list){
            result_mul *= num;
            result_add += num;
        }
              
        return (result_mul < (result_add * result_add))? 1 : 0;
    }
}