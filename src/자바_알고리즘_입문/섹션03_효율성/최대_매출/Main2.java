package 자바_알고리즘_입문.섹션03_효율성.최대_매출;

import java.util.*;

class Main2 {
	public void solution(int n1, int n2, int[] arr){
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < n2; i++) {
			sum += arr[i];
		}
		
		answer = sum;
		
		for(int i = n2; i < n1; i++) {
			sum += (arr[i] - arr[i-n2]);
			
			answer = Math.max(answer, sum);
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[] arr1 = new int[n1];
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = in.nextInt();
		}
		
		T.solution(n1, n2, arr1);
	}
}