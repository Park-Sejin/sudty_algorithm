package 자바_알고리즘_입문.섹션05_Stack_Queue.응급실;

import java.util.*;

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

class Main2 {
	public void solution(int[] arr, int m){
		Queue<Person> que = new LinkedList<>();
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			que.offer(new Person(i, arr[i]));
		}
		
		while(!que.isEmpty()) {
			Person person = que.poll();
			
			for(Person p : que) {
				if(p.priority > person.priority) {
					que.offer(person);
					
					person = null;
					break;
				}
			}
			
			if(person != null) {
				answer++;
				if(person.id == m) {
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
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