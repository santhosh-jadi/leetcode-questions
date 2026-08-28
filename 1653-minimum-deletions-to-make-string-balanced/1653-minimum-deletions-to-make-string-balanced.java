class Solution {
    public int minimumDeletions(String s) {
       int n=s.length();
       int c=0;
       int d=0;
    for(char ch:s.toCharArray())
    {
        if(ch=='b'){
            c++;
        }
        else
        {
       d=Math.min(d+1,c);
        }
    }
    return d;
    }
}