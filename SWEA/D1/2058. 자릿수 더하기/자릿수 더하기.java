import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        int sum = 0;
        
		while(n > 0){
            sum += n%10;
            n /= 10;
        }
        
		System.out.println(sum);
	}
}