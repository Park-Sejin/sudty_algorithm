package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.����_���ϱ�;

import java.util.*;

class Main {
	public void solution(int n, int k){
		Stack<Integer> stack = new Stack<>();
		int idx = -1;
		
		for(int i = 1; i <= n; i++) {
			stack.push(i);
		}
		
		while(stack.size() > 1) {
			idx += k;
			
			while(idx >= stack.size()) {
				idx -= stack.size();
			}
			
			stack.remove(idx--);
		}
		
		System.out.println(stack.peek());
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		T.solution(n, k);
	}
}