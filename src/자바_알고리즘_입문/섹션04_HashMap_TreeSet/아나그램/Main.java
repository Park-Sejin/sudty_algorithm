package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.아나그램;

import java.util.*;

class Main {
	public void solution(String str1, String str2){
		String answer = "";
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		
		answer = (map1.equals(map2))? "YES" : "NO";
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		T.solution(str1, str2);
	}
}