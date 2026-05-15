class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] ans = new int[n];

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            q.offer(i);
        }

        int i=0;

        while(!q.isEmpty()){
            
            int idx = q.poll();

            ans[idx] = deck[i];
            i++;

            if(!q.isEmpty()) {
                q.offer(q.poll());
            }
            
        }

        return ans;



    }
}