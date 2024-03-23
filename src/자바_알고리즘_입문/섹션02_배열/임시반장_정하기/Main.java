package �ڹ�_�˰���_�Թ�.����02_�迭.�ӽù���_���ϱ�;

import java.util.*;

class Main {
	public void solution(int n, int[][] arr){
		int answer = 0;
		int maxCnt = 0;
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			
			if(cnt > maxCnt) {
				maxCnt = cnt;
				answer = i;
			}
		}
		
		/*
		for(int i = 0; i < n; i++) {
			Set<Integer> list = new HashSet<>();
			
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < n; k++) {
					if(arr[i][j] == arr[k][j]) {
						list.add(k);
					}
				}
			}
			
			if(maxCnt < list.size()) {
				maxCnt = list.size();
				answer = i;
			}
		}
		*/
		
		System.out.println(answer+1);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		T.solution(n, arr);
	}
}