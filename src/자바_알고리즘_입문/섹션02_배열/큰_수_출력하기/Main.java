package 자바_알고리즘_입문.섹션02_배열.큰_수_출력하기;

import java.util.*;

class Main {
	public String solution(int num, String nums){
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
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = Integer.parseInt(in.nextLine());
		String input2 = in.nextLine();
		
		System.out.println(T.solution(input1, input2));
	}
}