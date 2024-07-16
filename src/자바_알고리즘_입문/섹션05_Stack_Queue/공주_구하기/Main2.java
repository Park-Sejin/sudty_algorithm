package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.����_���ϱ�;

import java.util.*;

class Main2 {
	public void solution(int n, int k){
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			que.offer(i);
		}
		
		while(que.size() > 1) {
			for(int i = 1; i < k; i++) {
				que.offer(que.poll());
			}
			que.poll();
		}
		
		System.out.println(que.peek());
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		T.solution(n, k);
	}
}