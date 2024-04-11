package �ڹ�_�˰���_�Թ�.����03_ȿ����.���ӵ�_�ڿ�����_��;

import java.util.*;

class Main {
	public void solution(int n){
		int answer = 0;
		int sum = 0, lt = 1;
		int m = n/2+1; // ���� �� 2���� ���̱� ������ n���� �˻� ���� �ʾƵ� ��
		
		for(int rt = 1; rt <= m; rt++) {
			sum += rt;
			
			if(sum == n) { answer++; }
			
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) { answer++; }
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		T.solution(n);
	}
}