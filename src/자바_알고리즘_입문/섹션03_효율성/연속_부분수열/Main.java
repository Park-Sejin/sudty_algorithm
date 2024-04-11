package �ڹ�_�˰���_�Թ�.����03_ȿ����.����_�κм���;

import java.util.*;

class Main {
	public void solution(int n, int m, int[] arr){
		int answer = 0;
		int sum = 0, point = 0;
		
		for(int i = 0; i < n; i++) {
			for(; point < n; point++) {
				sum += arr[point];
				
				if(sum == m) {
					answer++;
					point++;
					
					sum -= arr[i];
					break;
				}
				else if(sum > m) {
					sum -= (arr[i]+arr[point]);
					break;
				}
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