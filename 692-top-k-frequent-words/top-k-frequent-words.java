class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = words.length;

        for(int i=0;i<n;i++){
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }

        List<String> ans = new ArrayList<>(map.keySet());

        Collections.sort(ans, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(map.get(a)>map.get(b)){
                    return -1;
                }
                else if(map.get(a)<map.get(b)){
                    return 1;
                }
                else{
                    return a.compareTo(b);
                }
            }
        });

        return ans.subList(0, k);
        
    }
}