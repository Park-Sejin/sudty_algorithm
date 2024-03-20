package 자바_알고리즘_입문.섹션02_배열.봉우리;

import java.util.*;

class Main {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public void solution(int n, int[][] arr){
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < n && ny >= 0 && ny < n 
							&& arr[i][j] <= arr[nx][ny]) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
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
		
		T.solution(n, arr);
	}
	
	
	/*
	public void solution(int len, int[][] arr){
		int answer = 0;
		
		for(int i = 1; i < len-1; i++) {
			for(int j = 1; j < len-1; j++) {
				
				int l = arr[i][j-1], r = arr[i][j+1];
				int u = arr[i-1][j], d = arr[i+1][j];
				int max = Math.max(Math.max(l, r), Math.max(u, d));
				
				if(arr[i][j] > max) {
					answer++;
				}
				
			}
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] arr = new int[n+2][n+2];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		T.solution(n+2, arr);
	}
	*/
}