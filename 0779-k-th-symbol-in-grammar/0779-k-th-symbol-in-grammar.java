class Solution {
    private static int helper(int n,int k){
        if(n==1) return 0;
        int parentk=(k+1)/2;
        int val=helper(n-1,parentk);
        if(k%2==0){
            return val==0?1:0;
        }
        else{
            return val;
        }

    }
    public int kthGrammar(int n, int k) {
        return helper(n,k);
    }
}