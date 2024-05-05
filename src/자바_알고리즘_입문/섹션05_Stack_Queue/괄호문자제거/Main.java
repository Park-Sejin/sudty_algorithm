package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.��ȣ��������;

import java.util.*;

class Main {
	public void solution(String str){
		Stack<Character> stack = new Stack<>();
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}
			else if(ch == ')') {
				stack.pop();
			}
			else if(stack.empty()) {
				answer += ch;
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