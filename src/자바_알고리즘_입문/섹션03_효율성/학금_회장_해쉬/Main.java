package 자바_알고리즘_입문.섹션03_효율성.학금_회장_해쉬;

import java.util.*;

class Main {
	public void solution(int n, String str){
		HashMap<Character, Integer> hs = new HashMap<>();
		String answer = "";
		int maxCnt = 0;
		
		for(char ch : str.toCharArray()) {
			int cnt = (hs.get(ch) != null)? hs.get(ch) + 1 : 1;
			
			hs.put(ch, cnt);
		}
		
		for(Character i = 'A'; i < 'E'; i++) {
			if(hs.get(i) >= maxCnt) {
				maxCnt = hs.get(i);
				answer = Character.toString(i);
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String str = in.next();
		
		T.solution(n, str);
	}
}