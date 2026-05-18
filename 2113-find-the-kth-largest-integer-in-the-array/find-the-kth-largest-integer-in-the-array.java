// class Solution {
//     public String kthLargestNumber(String[] nums, int k) {
//         int n = nums.length;

//         quickSort(nums, 0, n-1);

//         return nums[n-k];
//     }

//     public void quickSort(int[]nums, int low, int high){
//         if(low<high){
//             int parIdx = par(nums, low, high);
//             quickSort(nums, low, parIdx-1);
//             quickSort(nums, parIdx+1, high);
//         }
//     }

//     public void par(int[] nums, int low, int high){
//         int n = nums.length;
//         int i = low-1;
//         int pivot = nums[high];

//         for(int j=0;j<n;j++){
//             if(nums[i]<=pivot){
//                 i++;
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//         }
//         int temp = nums[i+1];
//         nums[i+1] = nums[high];
//         nums[high] = temp;
//         return i+1;
//     }
// }



class Solution {
    class MyComparator implements Comparator<String>{
        public int compare(String a, String b){
            if(a.length()!=b.length()){
                return b.length() - a.length();
            }
            return b.compareTo(a);
        }
    }
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, new MyComparator());
        return nums[k-1];
    }
}