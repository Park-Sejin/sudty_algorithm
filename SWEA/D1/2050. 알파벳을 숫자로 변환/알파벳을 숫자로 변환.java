import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		String str=in.next();
		
        for(char ch : str.toCharArray()){
            System.out.print(ch-'A'+1 + " ");
        }
	}
}