package 자바_알고리즘_입문.섹션01_문자열.숫자만_추출;

import java.util.*;

class Main {
	public int solution(String str){
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			// 숫자인지 판별
			if(Character.isDigit(ch)) {
				answer += ch;
			}
		}
		
		return Integer.parseInt(answer);
		
		/*
		int answer = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch >= '0' && ch <= '9') {
				answer = answer * 10 + (ch-'0');
			}
		}
		
		return answer;
		*/
		
		/*
		int answer = Integer.parseInt(str.replaceAll("[^0-9]",""));
		
		return answer;
		*/
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(T.solution(input1));
	}
}