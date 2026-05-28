class Solution {
    public int numSpecial(int[][] mat) {
        int cnt = 0;
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    
                    boolean isSpeacial = true;

                    // for row
                    for(int col=0;col<m;col++){
                        if(mat[i][col]==1 && j!=col){
                            isSpeacial = false;
                            break;
                        }
                    }

                    if(isSpeacial){
                        for(int row=0;row<n;row++){
                            if(mat[row][j]==1 && row!=i){
                                isSpeacial = false;
                                break;
                            }
                        }
                    }

                    if(isSpeacial){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}