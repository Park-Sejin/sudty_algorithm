package �ڹ�_�˰���_�Թ�.����01_���ڿ�.����_��_�ܾ�;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "";
		
		for(String word : str.split(" ")) {
			if(answer.length() < word.length()) {
				answer = word;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));
	}
}