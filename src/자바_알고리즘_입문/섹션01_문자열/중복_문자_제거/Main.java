package �ڹ�_�˰���_�Թ�.����01_���ڿ�.�ߺ�_����_����;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
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