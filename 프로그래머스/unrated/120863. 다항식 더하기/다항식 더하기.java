class Solution {
    public String solution(String polynomial) {
        String[] split = polynomial.split(" ");
        int x = 0, num = 0;
        
        for(int i = 0; i < split.length; i+=2){
            if(split[i].indexOf("x") > -1){
                String str_x = split[i].replace("x", "");
                
                x += "".equals(str_x)? 1 : Integer.parseInt(str_x);
            }
            else {
                num += Integer.parseInt(split[i]);
            }
        }
        
        String answer = "";
        
        if(x > 0) {
            answer = (x == 1)? "x" : x + "x";
            
            if(num > 0){
                answer += (" + " + num);
            }
        }
        else {
            answer = num + "";
        }
        
        return answer;
    }
}