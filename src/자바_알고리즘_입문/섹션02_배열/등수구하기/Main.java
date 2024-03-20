package 자바_알고리즘_입문.섹션02_배열.등수구하기;

import java.util.*;

class Main {
	public void solution(int[] arr){
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int rank = 1;
			int sameCnt = 0;
			
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}
				
				if(arr[i] == arr[j]) {
					if(i > j) {
						answer[i] = answer[j];
					}
					
					rank++;
					sameCnt++;
				}
				else if(arr[i] < arr[j]) {
					rank++;
				}
			}
			answer[i] = rank-sameCnt;
		}
		
		for(int n : answer) {
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		int[] arr = new int[input1];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr);
	}
}