package �ڹ�_�˰���_�Թ�.����02_�迭.���丵;

import java.util.*;

class Main {
	public void solution(int[][] arr){
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[][] arr = new int[n2][n1];
		
		for(int i = 0; i < n2; i++) {
			for(int j = 0; j < n1; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		T.solution(arr);
	}
}