class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(char c:num.toCharArray()){
            while(!s.isEmpty()&&c<s.peek()&&k>0){
               s.pop();
               k--;
            }
            s.push(c);
        }
        while(!s.isEmpty()&&k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
          sb.append(s.pop());
        }
        sb.reverse();
        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0'){
            i++;
        }
        String ans=sb.substring(i);
         return ans.isEmpty()?"0":ans;

        
    }
}