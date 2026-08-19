// class Solution {
//     public int findMin(int[] nums) {
//        int left=0;
//        int right=0;
//        int minimum=0;
//        while(left<=right){
//         int mid=left+(right-left/2);
//         //left sorted
//         if(nums[left]<=nums[mid]){
//             minimum=nums[left];
//             left=mid+1;
//             for(int i=left;i<nums.length;i++){
//                 if(nums[i]<minimum){
//                     minimum=nums[i];
//                 }
//             }
//             return minimum;
//         }else{//right sorted
//             minimum=nums[mid];

//         }

//        }
//     }
// }

class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}