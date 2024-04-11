package 자바_알고리즘_입문.섹션03_효율성.연속된_자연수의_합;

import java.util.*;

class Main2 {
	public void solution(int n){
		int answer = 0;
		int cnt = 1;
		
		n--;
		while(n > 0) {
			cnt++;
			n = n-cnt;
			
			if(n%cnt == 0) { answer++; }
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		T.solution(n);
	}
}