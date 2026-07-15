class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int lf=i+1;
            int r=nums.length-1;
            while(lf<r){
                int sum=nums[i]+nums[lf]+nums[r];
                if(sum==0){
                    List<Integer> lr=new ArrayList<>();
                    lr.add(nums[i]);
                    lr.add(nums[lf]);
                    lr.add(nums[r]);
                    l.add(lr);
                    lf++;
                    r--;
                    while(lf<nums.length&&nums[lf]==nums[lf-1]){
                        lf++;
                    }
                    while(r>0&&nums[r]==nums[r+1]){
                        r--;
                    }

                }
                else if(sum<0){
                    lf++;
                }
                else if(sum>0){
                    r--;
                }
            }
        }
        return l;
        
    }
}