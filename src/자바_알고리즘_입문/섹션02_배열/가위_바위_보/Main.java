package 자바_알고리즘_입문.섹션02_배열.가위_바위_보;

import java.util.*;

class Main {
	public void solution(int[] nums1, int[] nums2){
		for(int i = 0; i < nums1.length; i++) {
			String result = "A";
			int A = nums1[i];
			int B = nums2[i];
			
			if(A == B) {
				result = "D";
			}
			else if(A == 1 && B == 2 || A == 2 && B == 3 || A == 3 && B == 1) {
				result = "B";
			}
			
			System.out.println(result);
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		int[] arr1 = new int[input1];
		int[] arr2 = new int[input1];
		
		for(int i = 0; i < input1; i++) {
			arr1[i] = in.nextInt();
		}
		for(int i = 0; i < input1; i++) {
			arr2[i] = in.nextInt();
		}
		
		T.solution(arr1, arr2);
	}
}