package �ڹ�_�˰���_�Թ�.����02_�迭.���丵;

import java.util.*;

class Main {
	public void solution(int n, int m, int[][] arr){
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int mto = arr[0][i];
			
			for(int j = i+1; j < n; j++) {
				int mti = arr[0][j];
				boolean mtoAt = true;
				
				for(int k = 1; k < m; k++) {
					for(int l = 0; l < n; l++) {
						if(arr[k][l] == mto) {
							break;
						}
						else if(arr[k][l] == mti) {
							mtoAt = false;
							break;
						}
					}
					
					if(!mtoAt) {
						break;
					}
				}
				
				if(mtoAt) {
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
		int m = in.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		T.solution(n, m, arr);
	}
}