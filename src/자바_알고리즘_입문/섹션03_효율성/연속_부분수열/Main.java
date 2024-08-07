package 자바_알고리즘_입문.섹션03_효율성.연속_부분수열;

import java.util.*;

class Main {
	public void solution(int n, int m, int[] arr){
		int answer = 0;
		int sum = 0, rt = 0;
		
		for(int lt = 0; lt < n; lt++) {
			for(; rt < n; rt++) {
				sum += arr[rt];
				
				if(sum == m) {
					answer++;
					rt++;
					
					sum -= arr[lt];
					break;
				}
				else if(sum > m) {
					sum -= (arr[lt]+arr[rt]);
					break;
				}
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(n, m, arr);
	}
}