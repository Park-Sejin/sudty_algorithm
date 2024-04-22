class Solution {
    public String solution(String phone_number) {
        String num1 = phone_number.substring(0, phone_number.length()-4);
        String num2 = phone_number.substring(phone_number.length()-4);
        
        return num1.replaceAll("[0-9]", "*") + num2;
    }
}