package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.매출액의_종류;

import java.util.*;

class Main {
	public void solution(int n, int m, int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] answer = new int[n-m+1];
		int lt = 0, rt = 0;
		
		while(rt < n) {
			map.put(arr[rt], map.getOrDefault(arr[rt++], 0) + 1);
			
			if(rt == m) {
				answer[lt] = map.size();
			}
			else if(rt > m) {
				map.put(arr[lt], map.get(arr[lt])-1);
				
				if(map.get(arr[lt]) == 0) {
					map.remove(arr[lt]);
				}
				
				answer[++lt] = map.size();
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
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