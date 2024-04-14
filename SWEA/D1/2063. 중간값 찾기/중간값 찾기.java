import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] nums = new int[n];

		for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
		}
        
		Arrays.sort(nums);
		System.out.println(nums[n/2]);
	}
}