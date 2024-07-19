package 자바_알고리즘_입문.섹션05_Stack_Queue.응급실;

import java.util.*;

class Main {
	public void solution(int[] arr, int m){
		Queue<Integer> que = new LinkedList<>();
		int answer = 0, idx = m;
		
		for(int num : arr) {
			que.offer(num);
		}
		
		for(int i = 100; i >= arr[m]; i--) {
			if(!que.contains(i)) { continue; }
			
			while(que.contains(i)) {
				if(que.peek() == i) {
					que.poll();
					answer++;
					
					if(idx == 0) { break; }
					idx--;
				}
				else {
					idx = (idx == 0)? que.size()-1 : idx-1;
					que.offer(que.poll());
				}
			}
		}
		
		System.out.println(answer + idx);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr, m);
	}
}