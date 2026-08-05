class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        if(n<2){
            return 0;
        }
        int m=0;

  
        Stack<Integer> l=new Stack<>();
        l.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                l.push(i);
            }
            else{
                l.pop();
                if(l.isEmpty()){
                    l.push(i);
                }
                else{
                 m=Math.max(m,i-l.peek());
                }
            }
        }
           
        return m;
    }
}