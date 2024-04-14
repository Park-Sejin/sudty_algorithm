import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] answer = new int[n];

		for(int i = 0; i < n; i++) {
            int max = 0;
            
            for(int j = 0; j < 10; j++){
                int num = in.nextInt();
                
                max = Math.max(max, num);
            }
            
            answer[i] = max;
		}

		for(int i = 0; i < n; i++) {
			System.out.println("#" + (i+1) + " " + answer[i]);
		}
	}
}