package �ڹ�_�˰���_�Թ�.����05_Stack_Queue.ũ����_�����̱�_īī��;

import java.util.*;

class Main {
	public void solution(int n, int[][] arr, int n2, int[] arr2){
		int answer = 0;
		int[] loc = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[j][i] != 0) {
					loc[i] = j;
					break;
				}
			}
		}
		
		for(int j : arr2) { 
			if(loc[j-1] == n){ continue; }
			
			int num = arr[loc[j-1]][j-1];
			
			if(!stack.isEmpty() && stack.peek() == num) {
				stack.pop();
				answer += 2;
			}
			else {
				stack.push(num);
			}
			
			loc[j-1]++;
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
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