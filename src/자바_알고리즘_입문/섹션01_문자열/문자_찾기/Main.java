package �ڹ�_�˰���_�Թ�.����01_���ڿ�.����_ã��;

import java.util.*;

class Main {
	public int solution(String str, char ch){
		int answer = 0;
		
		for(char c : str.toUpperCase().toCharArray()) {
			if(c == Character.toUpperCase(ch)) {
				answer ++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		
		System.out.println(T.solution(input1, input2));
	}
}