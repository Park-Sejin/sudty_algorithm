package 자바_알고리즘_입문.섹션03_효율성.최대_길이_연속부분수열;

import java.util.*;

class Main2 {
	public void solution(int n, int m, int[] arr){
		int answer = 0;
		int cnt = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) { cnt++; }
			
			while(cnt > m) {
				if(arr[lt] == 0) { cnt--; }
				
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
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