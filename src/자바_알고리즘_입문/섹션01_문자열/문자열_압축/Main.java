package �ڹ�_�˰���_�Թ�.����01_���ڿ�.���ڿ�_����;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "";
		str = str + " ";
		int cnt = 1;
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}
			else {
				answer += str.charAt(i);
				
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
		
		
		/*
		char ch = str.charAt(0);
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				cnt++;
			}
			else {
				answer += str.charAt(i-1) + ((cnt>1)? cnt+"" : "");
				
				cnt = 1;
				ch = str.charAt(i);
			}
		}
		
		answer += str.charAt(str.length()-1) + ((cnt>1)? cnt+"" : "");
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