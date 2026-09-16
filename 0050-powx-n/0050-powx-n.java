class Solution {
    private static double helper(double x,int n){
         if (n==0) return 1;
        if(n==1){
            return x; 
        }
        double val=helper(x,n/2);
        if((n&1)==0){
            return val*val;
        }
        else{
            return x*val*val;
        }
    }
    public double myPow(double x, int n) {
       
        if(n<0) return 1/helper(x,-n);
        return helper(x,n);
    }
}