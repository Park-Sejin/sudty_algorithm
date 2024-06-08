package 자바_알고리즘_입문.섹션05_Stack_Queue.쇠막대기;

import java.util.*;

class Main2 {
	public void solution(String str){
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			}
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') {
					answer += stack.size();
				}
				else {
					answer += 1;
				}
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		T.solution(str);
	}
}