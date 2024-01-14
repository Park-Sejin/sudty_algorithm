package 자바_알고리즘_입문.섹션01_문자열.단어_뒤집기;

import java.util.*;

class Main {
	public void solution(String[] str_arr){
		for(String str : str_arr) {
			/*
			 * 풀이 2
			 */
			char[] ch_arr = str.toCharArray();
			int lt = 0, rt = str.length()-1;
			
			while(lt < rt) {
				char temp = ch_arr[lt];
				
				ch_arr[lt++] = ch_arr[rt];
				ch_arr[rt--] = temp;
			}
			
			System.out.println(String.valueOf(ch_arr));
			
			/*
			 * 풀이 1
			String answer = new StringBuilder(str).reverse().toString();
			
			System.out.println(answer);
			*/
			
			/*
			 * 내가 제출한 코드
			String answer = "";
			
			for(int i = str.length()-1; i >= 0 ; i--) {
				answer += str.charAt(i);
			}
			
			System.out.println(answer);
			*/
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		String arr[] = new String[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = in.next();
		}
		
		T.solution(arr);
	}
}