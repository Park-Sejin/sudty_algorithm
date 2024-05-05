package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.��ȣ��������;

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