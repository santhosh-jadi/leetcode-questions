class Solution {
    public int minAddToMakeValid(String s) {

        int n=s.length();
        if(n==0){
            return 0;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&ch==')'&&stack.peek()=='('){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}