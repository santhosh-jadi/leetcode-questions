// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//     //     for (int i = 0; i < nums.length; i++) {
//     //         int max = kmax(nums, i);
//     //         int min = kmin(nums, i);

//     //         if (max - min <= k) {
//     //             return i;
//     //         }
//     //     }

//     //     return -1;
//     // }

//     // public static int kmax(int[] a, int j) {
//     //     int v = Integer.MIN_VALUE;

//     //     for (int l = 0; l <= j; l++) {
//     //         v = Math.max(v, a[l]);
//     //     }

//     //     return v;
//     // }

//     // public static int kmin(int[] a, int i) {
//     //     int v = Integer.MAX_VALUE;

//     //     for (int l = i; l < a.length; l++) {
//     //         v = Math.min(v, a[l]);
//     //     }

//     //     return v;
//     // }
    
// }
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);

            if (prefixMax - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}