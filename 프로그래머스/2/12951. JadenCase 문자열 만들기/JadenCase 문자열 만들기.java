class Solution {
    public String solution(String s) {
        String[] sp = s.split(" ", -1);
        
        for(int i = 0; i < sp.length; i++){
            if("".equals(sp[i])){ continue; }
            
            String s1 = sp[i].substring(0,1).toUpperCase();
            String s2 = sp[i].substring(1).toLowerCase();
            
            sp[i] = s1 + s2;
        }
        
        return String.join(" ", sp);
    }
}