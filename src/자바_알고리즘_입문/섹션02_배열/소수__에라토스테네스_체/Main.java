package 자바_알고리즘_입문.섹션02_배열.소수__에라토스테네스_체;

import java.util.*;

class Main {
	public void solution(int input1){
		int result = 0;
		int[] arr = new int[input1+1];
		
		for(int i = 2; i <= input1; i++) {
			if(arr[i] == 0) {
				result++;
				
				for(int j = i; j <= input1; j+=i) {
					arr[j] = 1;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		
		T.solution(input1);
	}
}