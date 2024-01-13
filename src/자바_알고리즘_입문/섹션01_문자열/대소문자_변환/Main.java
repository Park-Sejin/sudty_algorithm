package 자바_알고리즘_입문.섹션01_문자열.대소문자_변환;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				answer += Character.toLowerCase(ch);
			}
			else {
				answer += Character.toUpperCase(ch);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(T.solution(input1));
	}
}