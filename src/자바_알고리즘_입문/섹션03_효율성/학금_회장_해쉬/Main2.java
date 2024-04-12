package 자바_알고리즘_입문.섹션03_효율성.학금_회장_해쉬;

import java.util.*;

class Main2 {
	public void solution(int n, String str){
		HashMap<Character, Integer> hs = new HashMap<>();
		String answer = "";
		int maxCnt = 0;
		
		for(char ch : str.toCharArray()) {
			hs.put(ch, hs.getOrDefault(ch, 0) + 1);
		}
		
		for(char key : hs.keySet()) {
			if(hs.get(key) > maxCnt) {
				maxCnt = hs.get(key);
				answer = Character.toString(key);
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String str = in.next();
		
		T.solution(n, str);
	}
}