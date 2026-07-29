class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
int j = arr.length - 1;

while (i < j) {
    int m = i + (j - i) / 2;

    if (arr[m] > arr[m + 1]) {
        j = m;
    } else {
        i = m + 1;
    }
}

return i;
    }
}