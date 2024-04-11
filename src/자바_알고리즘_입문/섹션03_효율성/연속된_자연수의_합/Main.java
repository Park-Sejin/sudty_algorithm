package 자바_알고리즘_입문.섹션03_효율성.연속된_자연수의_합;

import java.util.*;

class Main {
	public void solution(int n){
		int answer = 0;
		int sum = 0, lt = 1;
		
		for(int rt = 1; rt < n; rt++) {
			sum += rt;
			
			if(sum == n) { answer++; }
			
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) { answer++; }
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		T.solution(n);
	}
}