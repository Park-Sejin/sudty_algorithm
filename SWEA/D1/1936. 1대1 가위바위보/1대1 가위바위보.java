import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		String answer = "A";
		
		if(a == 1 && b == 2) {
			answer = "B";
		}
		else if(a == 2 && b == 3) {
			answer = "B";
		}
		else if(a == 3 && b == 1){
			answer = "B";
		}
		
		System.out.println(answer);
	}
}