import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if(num1 > num2) {
                answer[i] = ">";
            }
            else if(num1 < num2) {
                answer[i] = "<";
            }
            else {
                answer[i] = "=";
            }
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("#" + (i+1) + " " + answer[i]);
		}
	}
}