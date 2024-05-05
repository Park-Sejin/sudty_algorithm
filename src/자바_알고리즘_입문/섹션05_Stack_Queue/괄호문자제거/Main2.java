package 자바_알고리즘_입문.섹션05_Stack_Queue.괄호문자제거;

import java.util.*;

class Main2 {
	public void solution(String str){
		Stack<Character> stack = new Stack<>();
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			if(ch == ')') {
				while(stack.pop() != '(');
			}
			else {
				stack.push(ch);
			}
		}
		
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
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