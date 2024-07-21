package 자바_알고리즘_입문.섹션06_정렬.선택정렬;

import java.util.*;

class Main {
	public void solution(int[] arr){
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr);
	}
}