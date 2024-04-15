package 자바_알고리즘_입문.섹션04_HashMap_TreeSet.모든_아나그램_찾기;

import java.util.*;

class Main {
	public void solution(String s, String t){
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> tmap = new HashMap<>();
		int answer = 0;
		int lt = 0, rt = 0;
		
		for(char ch : t.toCharArray()) {
			tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
		}
		
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			rt++;
			
			if(rt-lt == t.length()) {
				if(tmap.equals(map)) {
					answer++;
				}
				
				map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);
				
				if(map.get(s.charAt(lt)) == 0) {
					map.remove(s.charAt(lt));
				}
				lt++;
			}
		}
		
		System.out.print(answer);
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		String t = in.next();
		
		
		T.solution(s, t);
	}
}