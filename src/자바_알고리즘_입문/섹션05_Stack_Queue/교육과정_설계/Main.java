package 자바_알고리즘_입문.섹션05_Stack_Queue.교육과정_설계;

import java.util.*;

class Main {
	public void solution(String s1, String s2){
		String answer = "";
		Queue<Character> que = new LinkedList<>();
		
		for(char ch : s1.toCharArray()) {
			que.offer(ch);
		}
		
		for(char ch : s2.toCharArray()) {
			if(ch == que.peek()) {
				que.poll();
			}
			
			if(que.isEmpty()) { break; }
		}
		
		answer = (que.isEmpty())? "YES" : "NO";
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String s1 = in.next();
		String s2 = in.next();
		
		T.solution(s1, s2);
	}
}