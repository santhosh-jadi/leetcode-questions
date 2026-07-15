class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
            if(j>i+1&&nums[j]==nums[j-1]){
                continue;
            }
            int lf=j+1;
            int r=nums.length-1;
            while(lf<r){
                long sum=(long)nums[i]+nums[j]+nums[lf]+nums[r];
                if(sum==target){
                    List<Integer> lr=new ArrayList<>();
                    lr.add(nums[i]);
                    lr.add(nums[j]);
                    lr.add(nums[lf]);
                    lr.add(nums[r]);
                    l.add(lr);
                    lf++;
                    r--;
                    while(lf<r&&nums[lf]==nums[lf-1]){
                        lf++;
                    }
                    while(lf<r&&nums[r]==nums[r+1]){
                        r--;
                    }

                }
                  else if(sum<target){
                    lf++;
                    }
                    else if(sum>target){
                    r--;
                    }
                }
            }
        }
        return l;
        
    }
}