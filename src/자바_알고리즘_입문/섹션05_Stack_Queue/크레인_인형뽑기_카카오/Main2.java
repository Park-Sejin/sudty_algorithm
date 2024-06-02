package 자바_알고리즘_입문.섹션05_Stack_Queue.크레인_인형뽑기_카카오;

import java.util.*;

class Main2 {
	public void solution(int n, int[][] arr, int n2, int[] arr2){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int j : arr2) {
			for(int i = 0; i < n; i++) {
				if(arr[i][j-1] != 0) {
					int num = arr[i][j-1];
					
					arr[i][j-1] = 0;
					
					if(!stack.empty() && stack.peek() == num) {
						stack.pop();
						answer += 2;
					}
					else {
						stack.push(num);
					}
					
					break;
				}
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int n2 = in.nextInt();
		int[] arr2 = new int[n2];
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
		}
		
		T.solution(n, arr, n2, arr2);
	}
}