import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(char ch : a.toCharArray()){
            result += (Character.isLowerCase(ch))? Character.toUpperCase(ch) : Character.toLowerCase(ch);
        }
        
        System.out.println(result);
    }
}