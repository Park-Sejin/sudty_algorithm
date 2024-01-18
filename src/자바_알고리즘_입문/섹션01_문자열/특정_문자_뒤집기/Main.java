package 자바_알고리즘_입문.섹션01_문자열.특정_문자_뒤집기;

import java.util.*;

class Main {
	public String solution(String str){
		char[] ch_arr = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		
		while(lt < rt) {
			char lt_ch = Character.toUpperCase(str.charAt(lt));
			char rt_ch = Character.toUpperCase(str.charAt(rt));
			
			if(!(lt_ch >= 'A' && lt_ch <= 'Z')) {
				lt++;
			}
			else if(!(rt_ch >= 'A' && rt_ch <= 'Z')) {
				rt--;
			}
			else {
				char temp = ch_arr[lt];
				
				ch_arr[lt++] = ch_arr[rt];
				ch_arr[rt--] = temp;
			}
		}
		
		return String.valueOf(ch_arr);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(T.solution(input1));
	}
}