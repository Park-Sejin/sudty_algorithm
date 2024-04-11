package �ڹ�_�˰���_�Թ�.����03_ȿ����.����_�κм���;

import java.util.*;

class Main2 {
	public void solution(int n, int m, int[] arr){
		int answer = 0;
		int sum = 0, lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			
			if(sum == m) { answer++; }
			
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) { answer++; }
			}
		}
		
		System.out.print(answer);
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
		
		T.solution(n, m, arr);
	}
}