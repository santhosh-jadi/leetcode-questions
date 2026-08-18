class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        int a[] = new int[k];

        // First window
        for (int i = 0; i < k; i++) {
            a[i] = nums[i];
        }

        HashSet<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }

        for (int x : set) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }

        // Remaining windows
        for (int i = k; i < nums.length; i++) {
            int ar[] = function(a, i, nums);

            set = new HashSet<>();

            for (int x : ar) {
                set.add(x);
            }

            for (int x : set) {
                h.put(x, h.getOrDefault(x, 0) + 1);
            }
        }

        int max = -1;

        for (int x : h.keySet()) {
            if (h.get(x) == 1) {
                max = Math.max(max, x);
            }
        }

        return max;
    }

    public static int[] function(int a[], int i, int nums[]) {
        for (int k = 1; k < a.length; k++) {
            a[k - 1] = a[k];
        }

        a[a.length - 1] = nums[i];

        return a;
    }
}