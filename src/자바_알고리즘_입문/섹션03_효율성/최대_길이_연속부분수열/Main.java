package �ڹ�_�˰���_�Թ�.����03_ȿ����.�ִ�_����_���Ӻκм���;

import java.util.*;

class Main {
	public void solution(int n, int m, int[] arr){
		int answer = 0;
		int cnt = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) { cnt++; }
			
			if(cnt > m) {
				answer = Math.max(answer, rt-lt);
				
				for(int i = lt; i < n; i++) {
					lt++;
					if(arr[i] == 0) { break; }
				}
				
				cnt--;
			}
		}
		
		System.out.print(answer);
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
		
		T.solution(n, m, arr);
	}
}