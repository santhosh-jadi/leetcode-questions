class Solution {
    public String reverseStr(String s, int k) {
        char a[]=s.toCharArray();
    
        for(int j=0;j<a.length;j+=2*k){
            int end = Math.min(j+k, a.length);

            for(int i=j;i<j+(end-j)/2;i++){
                char ch = a[i];
                a[i] = a[end-i+j-1];
                a[end-i+j-1] = ch;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(char c:a){
            sb.append(c);
        }
        return sb.toString();
        
    }
}