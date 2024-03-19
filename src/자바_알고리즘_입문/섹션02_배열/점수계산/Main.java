package 자바_알고리즘_입문.섹션02_배열.점수계산;

import java.util.*;

class Main {
	public void solution(int[] arr){
		int cnt = 0;
		int answer = 0;
		
		for(int n : arr) {
			if(n == 1) {
				answer += ++cnt;
			}
			else {
				cnt = 0;
			}
		}
		
		System.out.println(answer);
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