package �ڹ�_�˰���_�Թ�.����03_ȿ����.���ӵ�_�ڿ�����_��;

import java.util.*;

class Main2 {
	public void solution(int n){
		int answer = 0;
		int cnt = 1;
		
		n--;
		while(n > 0) {
			cnt++;
			n = n-cnt;
			
			if(n%cnt == 0) { answer++; }
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		T.solution(n);
	}
}