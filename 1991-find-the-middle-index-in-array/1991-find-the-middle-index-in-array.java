class Solution {
    public int findMiddleIndex(int[] nums) {
        int a[]=new int[nums.length];
        int n=nums.length;
        int t=nums[0];
        a[0]=nums[0];
        if(n==1){
            return 0;
        }

        for(int i=1;i<n;i++){
            a[i]=a[i-1]+nums[i];
            t+=nums[i];
        }
          if (t - a[0] == 0) {
            return 0;
        }
        for(int i=1;i<n;i++){
            int m=a[i-1];
            if(m==t-a[i]){
                return i;
            } 
        }
        return -1;
        
    }
}