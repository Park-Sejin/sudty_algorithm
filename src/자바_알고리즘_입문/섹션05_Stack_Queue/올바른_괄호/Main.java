package 자바_알고리즘_입문.섹션05_Stack_Queue.올바른_괄호;

import java.util.*;

class Main {
	public void solution(String str){
		HashMap<Integer, Integer> map = new HashMap<>();
		String answer = "YES";
		int cnt = 0;
		
		for(char ch : str.toCharArray()) {
			cnt = cnt + ((ch == '(')? 1 : -1);
			
			if(cnt < 0) {
				answer = "NO";
				break;
			}
		}
		
		if(cnt != 0) {
			answer = "NO";
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		T.solution(str);
	}
}