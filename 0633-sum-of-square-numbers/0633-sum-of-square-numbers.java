class Solution {
    public boolean judgeSquareSum(int c) {
      long l=0;
      long m=(long)Math.sqrt(c);
      while(l<=m){
        long s=l*l+m*m;
        if(s==c){
            return true;
        }
        else if(s<c){
            l++;
        }
        else{
            m--;
        }
      }
      return false;
    }
}