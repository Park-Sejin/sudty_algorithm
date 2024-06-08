package 자바_알고리즘_입문.섹션05_Stack_Queue.쇠막대기;

import java.util.*;

class Main {
	public void solution(String str){
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		boolean pointAt = true;
		
		for(char ch : str.toCharArray()) {
			if(ch == '(') {
				stack.push('(');
				pointAt = true;
			}
			else {
				if(pointAt) {
					stack.pop();
					answer += stack.size();
					pointAt = false;
				}
				else {
					stack.pop();
					answer += 1;
				}
			}
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