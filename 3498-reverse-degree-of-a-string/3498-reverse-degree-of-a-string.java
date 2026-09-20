class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int rindx=26-(ch-'a');
            int product=rindx*(i+1);
            ans+=product;

        }
        return ans;
    }
}