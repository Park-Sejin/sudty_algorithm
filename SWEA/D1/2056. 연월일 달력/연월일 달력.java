import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.next();
        }
        
        int[] lastDay = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < n; i++){
            String result = "-1";
            int month = Integer.parseInt(arr[i].substring(4, 6));
            int day = Integer.parseInt(arr[i].substring(6, 8));
            
            if(day >= 1 && day <= lastDay[month]){
                result = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6, 8);
            }
            
            System.out.println("#" + (i+1) + " " + result);
        }
	}
}