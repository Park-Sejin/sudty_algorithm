package �ڹ�_�˰���_�Թ�.����02_�迭.ū_��_����ϱ�;

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