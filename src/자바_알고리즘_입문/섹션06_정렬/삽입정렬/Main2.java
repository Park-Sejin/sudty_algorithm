package �ڹ�_�˰���_�Թ�.����06_����.��������;

import java.util.*;

class Main2 {
	public void solution(int[] arr){
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i], j;
			for(j = i-1; j >= 0; j--) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1] = temp;
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		T.solution(arr);
	}
}