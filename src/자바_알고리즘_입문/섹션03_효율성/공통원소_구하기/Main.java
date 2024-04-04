package 자바_알고리즘_입문.섹션03_효율성.공통원소_구하기;

import java.util.*;

class Main {
	public void solution(int n1, int[] arr1, int n2, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					int temp = arr1[i];
					
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = i; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		
		for(int num : answer) {
			System.out.print(num + " ");
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