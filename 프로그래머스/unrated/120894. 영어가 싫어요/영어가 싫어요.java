class Solution {
    public long solution(String numbers) {
        String answer = numbers;
        String[] numArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numArray.length; i++){
            answer = answer.replaceAll(numArray[i], i+"");
        }
        
        return Long.parseLong(answer);
    }
}