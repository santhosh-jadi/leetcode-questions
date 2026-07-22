class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>=1){
            int m=n%2;
            if(m==1){
                c++;
            }
            n/=2;
        }
        return c;
        
    }
}