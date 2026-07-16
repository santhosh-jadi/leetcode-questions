class Solution {
    public long gcdSum(int[] nums) {
        int m=Integer.MIN_VALUE;
        int n=nums.length;
        int p[]=new int[n];
        for(int i=0;i<n;i++){
            m=Math.max(m,nums[i]);
            int d=gcd(nums[i],m);
            p[i]=d;
        }
        Arrays.sort(p);
        long s=0;
        for(int i=0;i<n/2;i++){
            int k=gcd(p[i],p[n-i-1]);
            s+=k;

        }
        return s;
        
    }
    public static int  gcd(int a,int b){
         a = Math.abs(a);
         b = Math.abs(b);
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}