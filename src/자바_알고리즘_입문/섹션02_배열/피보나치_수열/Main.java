package �ڹ�_�˰���_�Թ�.����02_�迭.�Ǻ���ġ_����;

import java.util.*;

class Main {
	public void solution(int input1){
		int num1 = 0, num2 = 0;
		
		for(int i = 0; i < input1; i++) {
			int sum = num1 + num2;
			
			num1 = num2;
			num2 = (sum == 0)? 1 : sum;
			
			System.out.print(num2 + ((i < input1-1)? " " : ""));
		}
		
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		
		T.solution(input1);
	}
}