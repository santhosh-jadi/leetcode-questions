class Solution {
    public int[] distributeCandies(int candies, int num_people) {
 int[] a = new int[num_people];
int give = 1;
int i = 0;

while (candies > 0) {
    int curr = Math.min(give, candies);
    a[i % num_people] += curr;
    candies -= curr;
    give++;
    i++;
}

return a;  
}
}