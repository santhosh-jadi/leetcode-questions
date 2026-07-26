class Solution {
    public int maximumProduct(int[] nums) {
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE,m3=Integer.MIN_VALUE;
        int p=Integer.MIN_VALUE;
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        for(int num:nums){
           
            if(num>m1){
                m3=m2;
                m2=m1;
                m1=num;
            }
            else if(num>m2){
                m3=m2;
                m2=num;
            }
            else if(num>m3){
                m3=num;
            }

           if (num < s1) {
                s2 = s1;
                s1 = num;
            } else if (num < s2) {
                s2 = num;
            }
        }

        int p1 = m1 * m2 * m3;
        int p2 = m1 * s1 * s2;
         p=Math.max(p1,p2);
        return p;
    }
}