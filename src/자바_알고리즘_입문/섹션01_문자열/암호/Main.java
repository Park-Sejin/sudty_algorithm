package 자바_알고리즘_입문.섹션01_문자열.암호;

import java.util.*;

class Main {
	public String solution(int num, String str){
		String answer = "";
		str = str.replace("#", "1").replace("*", "0");
		
		for(int i = 0; i < str.length(); i+=7) {
			String s = str.substring(i, i+7);
			
			answer += (char) Integer.parseInt(s, 2);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		String input2 = in.next();
		
		System.out.println(T.solution(input1, input2));
	}
}