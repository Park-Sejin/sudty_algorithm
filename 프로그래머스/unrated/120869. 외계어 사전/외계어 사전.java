class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String str : dic) {
            for(String key : spell){
                if(str.indexOf(key) == -1){
                    break;
                }
                else if(key.equals(spell[spell.length-1])){
                    return 1;
                }
            }
        }
        
        return answer;
    }
}