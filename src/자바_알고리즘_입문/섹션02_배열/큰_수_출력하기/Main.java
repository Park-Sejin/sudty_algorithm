package 자바_알고리즘_입문.섹션02_배열.큰_수_출력하기;

import java.util.*;

class Main {
	public void solution(int num, int[] nums){
		List<Integer> answer = new ArrayList<Integer>();
		answer.add(nums[0]);
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] < nums[i]) {
				answer.add(nums[i]);
			}
		}
		
		for(int n : answer) {
			System.out.print(n + " ");
		}
		
		/*
		String[] numbers = nums.split(" ");
		String answer = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			int num1 = Integer.parseInt(numbers[i-1]);
			int num2 = Integer.parseInt(numbers[i]);
			
			if(num1 < num2) {
				answer += (" " + num2);
			}
		}
		
		return answer;
		*/
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		/*
		int input1 = Integer.parseInt(in.nextLine());
		String input2 = in.nextLine();
		*/
		
		int input1 = in.nextInt();
		int[] arr = new int[input1];
		
		for(int i = 0; i < input1; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(input1, arr);
	}
}