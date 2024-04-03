package 자바_알고리즘_입문.섹션03_효율성.두_배열_합치기;

import java.util.*;

class Main2 {
	public void solution(int n1, int[] arr1, int n2, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;
		
		while(p1 < n1 && p2 < n2) {
			if(arr1[p1] < arr2[p2]) {
				answer.add(arr1[p1++]);
			}
			else {
				answer.add(arr2[p2++]);
			}
		}
		
		while(p1<n1) { answer.add(arr1[p1++]); }
		while(p2<n2) { answer.add(arr2[p2++]); }
		
		for(int num : answer) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
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