package 자바_알고리즘_입문.섹션01_문자열.문장_속_단어;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "";
		
		for(String word : str.split(" ")) {
			if(answer.length() < word.length()) {
				answer = word;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));
	}
}