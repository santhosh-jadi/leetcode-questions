class Solution {
    public long countCommas(long n) {
        if(n<999){
            return 0;
        }
        long start=1000;
        long c=0;
        while(start<=n){
            c+=n-start+1;
            start=start*1000;
        }
        return c;
    }
} 