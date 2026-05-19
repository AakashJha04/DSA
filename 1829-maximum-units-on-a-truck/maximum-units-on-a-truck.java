class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b)->b[1] - a[1]);
        int maximumNumberOfBoxes = 0;

        for(int i=0;i<boxTypes.length;i++){
            if(truckSize<=0){
                break;
            }
            if(boxTypes[i][0]<=truckSize){
                maximumNumberOfBoxes += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                maximumNumberOfBoxes += truckSize*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
        }
        return maximumNumberOfBoxes;
    }
}



// try it 
/*
boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize=10
            50       10     28   27
            
sort:      [5,10]   [4,7]  [3,9]   [2,5]. // wrong sorting
sort by unitOFBoxes:  [5,10]  [3,9]  [4,7]  [2,5].  // correct sorting

consider:   5        4      1 = 50+28+9=87 // wrong ans
consider:   50      27   14  = 91         // correct ans 
*/