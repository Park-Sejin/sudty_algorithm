package 자바_알고리즘_입문.섹션02_배열.격자판_최대합;

import java.util.*;

class Main {
	public void solution(int len, int[][] arr){
		int answer = 0;
		int lSum = 0, rSum = 0;
		
		for(int i = 0; i < len; i++) {
			int sum1 = 0, sum2 = 0;
			
			for(int j = 0; j < len; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
				
				if(i == j) {
					lSum += arr[i][j];
				}
			}
			
			rSum += arr[i][len-1-i];
			answer = Math.max(answer, Math.max(sum1, sum2));
		}
		
		answer = Math.max(answer, Math.max(lSum, rSum));
		
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		T.solution(n, arr);
	}
}