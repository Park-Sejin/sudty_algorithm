import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			answer[i] = (a/b) + " " + (a%b);
		}
		
		for(int i = 0; i < n; i++){
			System.out.printf("#%d %s\n", i+1, answer[i]);
		}
	}
}