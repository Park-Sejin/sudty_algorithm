package �ڹ�_�˰���_�Թ�.����01_���ڿ�.��ȿ��_�Ӹ����;

import java.util.*;

class Main {
	public String solution(String str){
		String answer = "YES";
		
		str = str.replaceAll("[^a-zA-Z]","");
		String cmpStr = new StringBuilder(str).reverse().toString();
		
		if(!str.equalsIgnoreCase(cmpStr)) {
			answer = "NO";
		}
		
		/*
		int lt = 0, rt = str.length()-1;
		
		while(lt < rt) {
			char lt_ch = Character.toUpperCase(str.charAt(lt));
			char rt_ch = Character.toUpperCase(str.charAt(rt));
			
			if(!Character.isAlphabetic(lt_ch)) {
				lt++;
			}
			else if(!Character.isAlphabetic(rt_ch)) {
				rt--;
			}
			else {
				if(lt_ch != rt_ch) {
					return "NO";
				}
				
				lt++;
				rt--;
			}
		}
		*/
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));
	}
}