package 자바_알고리즘_입문.섹션05_Stack_Queue.공주_구하기;

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