package �ڹ�_�˰���_�Թ�.����01_���ڿ�.���ڸ�_����;

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