package 자바_알고리즘_입문.섹션01_문자열.숫자만_추출;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = str.replaceAll("[^0-9]","").replaceAll("^0+", "");
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(T.solution(input1));
	}
}