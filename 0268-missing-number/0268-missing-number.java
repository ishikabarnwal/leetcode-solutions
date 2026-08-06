// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int xor = 0;

//         // XOR all indices and array values
//         for (int i = 0; i < n; i++) {
//             xor ^= i;
//             xor ^= nums[i];
//         }

//         // XOR with n (last number in range)
//         xor ^= n;

//         return xor;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
