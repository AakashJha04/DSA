class Solution {
    public String makeLargestSpecial(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int start = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            sum += (ch=='1') ? 1 : -1;
            if(sum==0){
                String inside = s.substring(start+1, i);
                ans.add("1"+makeLargestSpecial(inside)+"0");
                start=i+1;
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        for(String ans_prime: ans){
            result.append(ans_prime);
        }
        return result.toString();
        }
    }
