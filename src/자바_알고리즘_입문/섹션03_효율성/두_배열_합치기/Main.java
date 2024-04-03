package 자바_알고리즘_입문.섹션03_효율성.두_배열_합치기;

import java.util.*;

class Main {
	public void solution(int n1, int[] arr1, int n2, int[] arr2){
		int j = 0, k = 0;
		
		for(int i = 0; i < n1+n2; i++) {
			int num1 = (j < n1)? arr1[j] : Integer.MAX_VALUE;
			int num2 = (k < n2)? arr2[k] : Integer.MAX_VALUE;
			
			if(num1 <= num2) {
				j++;
			}
			else {
				k++;
			}
			
			System.out.print(Math.min(num1, num2) + " ");
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt();
		int[] arr1 = new int[n1];
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = in.nextInt();
		}
		
		int n2 = in.nextInt();
		int[] arr2 = new int[n2];
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
		}
		
		T.solution(n1, arr1, n2, arr2);
	}
}