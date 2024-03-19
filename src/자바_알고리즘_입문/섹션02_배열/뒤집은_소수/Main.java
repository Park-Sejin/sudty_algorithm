package �ڹ�_�˰���_�Թ�.����02_�迭.������_�Ҽ�;

import java.util.*;

class Main {
	public void solution(String[] arr){
		for(String str : arr) {
			StringBuffer sb = new StringBuffer(str).reverse();
			int num = Integer.parseInt(sb.toString());
			int[] nums = new int[num+1];
			
			for(int i = 2; i <= num; i++) {
				if(nums[i] == 0) {
					for(int j = i*2; j <= num; j+=i) {
						nums[j] = 1;
					}
				}
			}
			
			if(num != 1 && nums[num] == 0) {
				System.out.print(num + " ");
			}
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		String[] arr = new String[input1];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		T.solution(arr);
	}
}