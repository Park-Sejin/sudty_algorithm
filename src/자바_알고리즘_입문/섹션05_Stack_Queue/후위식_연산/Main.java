package 자바_알고리즘_입문.섹션05_Stack_Queue.후위식_연산;

import java.util.*;

class Main {
	public void solution(String str){
		Stack<Integer> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			//Character.isDigit(ch)
			if(ch >= '1' && ch <= '9') {
				stack.push(Integer.parseInt(ch+""));
			}
			else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				
				switch(ch) {
					case '+' : stack.push(num2 + num1); break;
					case '-' : stack.push(num2 - num1); break;
					case '*' : stack.push(num2 * num1); break;
					case '/' : stack.push(num2 / num1); break;
				}
			}
		}
		
		System.out.print(stack.peek());
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		T.solution(str);
	}
}