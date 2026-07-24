

class Solution {
    public int uniqueXorTriplets(int[] nums) {
    //     HashSet<Integer> pairXor = new HashSet<>();
    // O(n^2)
    //    int n=nums.length;
    //   for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //            pairXor.add(nums[i] ^ nums[j]);
    //         }
    //      }
    //    HashSet<Integer> ans = new HashSet<>();

    //     for (int x : pairXor) {
    //            for (int num : nums) {
    //               ans.add(x ^ num);
    //           }
    //        }
    //   return ans.size();
    // CAN BE SOLVED IN O(n^3)
 
      int n = nums.length;

        if (n == 1) return 1;
        if (n == 2) return 2;

        return Integer.highestOneBit(n) << 1;
    }

}