package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.아나그램;

import java.util.*;

class Main2 {
	public void solution(String str1, String str2){
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : str2.toCharArray()) {
			if(!map.containsKey(ch) || map.get(ch) == 0) {
				answer = "NO";
				break;
			}
			
			map.put(ch, map.get(ch)-1);
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		T.solution(str1, str2);
	}
}