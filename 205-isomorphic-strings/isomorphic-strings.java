class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for(int i=0 ;i<s.length();i++){
            char si = s.charAt(i);
            char ti = t.charAt(i);

            if(mapST.containsKey(si) && mapST.get(si)!=ti){
                return false;
            }

            if(mapTS.containsKey(ti) && mapTS.get(ti)!=si){
                return false;
            }

            mapST.put(si, ti);
            mapTS.put(ti, si);
        }

        return true;
    }
}