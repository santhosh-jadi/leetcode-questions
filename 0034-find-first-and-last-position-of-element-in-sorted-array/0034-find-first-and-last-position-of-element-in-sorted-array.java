
       class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                ans = m;
                r = m - 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }

    public int findLast(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                ans = m;
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}