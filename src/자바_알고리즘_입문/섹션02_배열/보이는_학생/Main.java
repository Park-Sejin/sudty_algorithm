package 자바_알고리즘_입문.섹션02_배열.보이는_학생;

import java.util.*;

class Main {
	public void solution(int[] nums){
		int answer = 0;
		int tc = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(tc < nums[i]) {
				answer ++;
				tc = nums[i];
			}
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		int[] arr = new int[input1];
		
		for(int i = 0; i < input1; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr);
	}
}