package �ڹ�_�˰���_�Թ�.����01_���ڿ�.���ڸ�_����;

import java.util.*;

class Main {
	public int solution(String str){
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			// �������� �Ǻ�
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