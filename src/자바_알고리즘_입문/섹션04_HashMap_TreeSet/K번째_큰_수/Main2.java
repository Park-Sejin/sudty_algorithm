package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.K번째_큰_수;

import java.util.*;

class Main2 {
	public void solution(int n, int m, int[] arr){
		TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
		int answer = -1;
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				int sum = arr[i] + arr[j];
				
				for(int k = j+1; k < n; k++) {
					tree.add(sum + arr[k]);
				}
			}
		}
		
		int i = 1;
		for(int x : tree) {
			if(i++ >= m) {
				answer = x;
				break;
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