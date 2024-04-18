import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int answer = 1;
        
        for(int i = 0; i <= n; i++){
            System.out.print(answer + " ");
            answer *= 2;
        }
	}
}