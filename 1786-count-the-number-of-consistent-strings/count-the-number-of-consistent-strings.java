class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            map.put(ch, 1);
        }

        int ans = 0;
        boolean flag = false;

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char c = words[i].charAt(j);
                if(!map.containsKey(c)){
                    System.out.println("----" + flag);
                    flag = true;
                    // break;
                }
            }
            if(flag==false){
                ans++;
            }
            flag = false;
        }

        return ans;
    }
}