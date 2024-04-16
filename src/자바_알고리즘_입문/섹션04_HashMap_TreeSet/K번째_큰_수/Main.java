package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.K번째_큰_수;

import java.util.*;

class Main {
	public void solution(int n, int m, int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		int answer = -1;
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				int sum = arr[i] + arr[j];
				
				for(int k = j+1; k < n; k++) {
					int key = sum + arr[k];
					map.put(key, map.getOrDefault(key, 0) + 1);
				}
			}
		}
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);
		Collections.reverse(keySet);
		
		if(keySet.size() >= m) {
			answer = keySet.get(m-1);
		}
		
		System.out.print(answer);
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