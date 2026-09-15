class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
  
        sub(nums, ans, l, 0);

    return ans;
}
    
public static void sub(int[] a, List<List<Integer>> ans, List<Integer> l, int i) {
    if (i == a.length) {

        ans.add(new ArrayList<>(l));
        return;
    }

    l.add(a[i]);
    sub(a, ans, l, i + 1);

    l.remove(l.size() - 1);
    int idx=i+1;
    while(idx<a.length&&a[idx]==a[idx-1]){
        idx++;
    }
    sub(a, ans, l, idx);
}

}