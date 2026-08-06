class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int k=n;k<=100;k++ ){
            int p=1;
            int m=k;
           while(m!=0){
            p*=m%10;
            m/=10;
           }
           if(p%t==0){
            return k;
           }
        }
        return -1;
        
    }
}