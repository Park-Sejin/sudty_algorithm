package �ڹ�_�˰���_�Թ�.����03_ȿ����.�������_���ϱ�;

import java.util.*;

class Main2 {
	public void solution(int n1, int[] arr1, int n2, int[] arr2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int j = 0, k = 0;
		while(j < n1 && k < n2) {
			if(arr1[j] == arr2[k]) {
				answer.add(arr1[j]);
				j++;
				k++;
			}
			else if(arr1[j] > arr2[k]) {
				k++;
			}
			else {
				j++;
			}
		}
		
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