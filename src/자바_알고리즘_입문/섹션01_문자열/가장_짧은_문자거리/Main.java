package �ڹ�_�˰���_�Թ�.����01_���ڿ�.����_ª��_���ڰŸ�;

import java.util.*;

class Main {
	public void solution(String str, char ch){
		int[] str_idxs = new int[str.length()];
		int len = 100; // �ִ� ���� ����
		
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				len = 0;
			}
			else {
				len++;
			}
			
			str_idxs[i] = len;
		}
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(ch == str.charAt(i)) {
				len = 0;
			}
			else {
				len++;
			}
			
			str_idxs[i] = Math.min(str_idxs[i], len);
		}
		
		for(int num : str_idxs) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		
		T.solution(input1, input2);
	}
}