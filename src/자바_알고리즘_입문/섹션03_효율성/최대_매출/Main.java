package 자바_알고리즘_입문.섹션03_효율성.최대_매출;

import java.util.*;

class Main {
	public void solution(int n1, int n2, int[] arr1){
		int answer = 0;
		
		for(int i = 0; i < arr1.length-n2; i++) {
			int add = 0;
			for(int j = i; j < i+n2; j++) {
				add += arr1[j];
			}
			
			answer = Math.max(answer, add);
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
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