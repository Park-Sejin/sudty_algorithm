class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        
        for(String str : quiz){
            String[] split = str.split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);
            int num3 = Integer.parseInt(split[4]);
            
            int result = ("-".equals(split[1]))? num1-num2 : num1+num2;
            answer[i++] = (result == num3)? "O" : "X";
        }
        
        return answer;
    }
}