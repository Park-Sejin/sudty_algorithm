package 자바_알고리즘_입문.섹션02_배열.뒤집은_소수;

import java.util.*;

class Main {
	public Boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public void solution(int[] arr){
		for(int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			int result = 0;
			
			while(tmp > 0) {
				result = result*10 + tmp%10;
				tmp = tmp/10;
			}
			
			if(isPrime(result)){
				System.out.print(result + " ");
			}
		}
		
		/*for(int n : arr) {
			StringBuffer sb = new StringBuffer(n+"").reverse();
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
		}*/
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		int[] arr = new int[input1];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr);
	}
}