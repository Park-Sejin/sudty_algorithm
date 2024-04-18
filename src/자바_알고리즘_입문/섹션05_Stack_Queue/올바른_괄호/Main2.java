package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.�ùٸ�_��ȣ;

import java.util.*;

class Main2 {
	public void solution(String str){
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(Character ch : str.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}
			else {
				if(stack.empty()){
					answer = "NO";
					break;
				}
				
				stack.pop();
			}
		}
		
		if(!stack.empty()){
			answer = "NO";
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