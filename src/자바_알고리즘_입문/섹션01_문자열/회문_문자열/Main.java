package 자바_알고리즘_입문.섹션01_문자열.회문_문자열;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "YES";
		
		String cmpStr = new StringBuilder(str).reverse().toString();
		
		// 대소문자 무시
		if(!str.equalsIgnoreCase(cmpStr)) {
			answer = "NO";
		}
		
		/*
		int lt = 0, rt = str.length()-1;
		
		while(lt < rt) {
			int lt_ch = Character.toUpperCase(str.charAt(lt++));
			int rt_ch = Character.toUpperCase(str.charAt(rt--));
			
			if(lt_ch != rt_ch) {
				return "NO";
			}
		}
		*/
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(T.solution(input1));
	}
}