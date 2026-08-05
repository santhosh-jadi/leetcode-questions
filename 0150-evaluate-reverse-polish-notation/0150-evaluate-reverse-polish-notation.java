class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> s=new Stack<>();
        for(String ch:tokens){
            switch(ch){   
                case "+":
                    int a=s.pop();
                    int b=s.pop();
                    s.push(b+a);
                    break;
                case "-":
                     a=s.pop();
                     b=s.pop();
                    s.push(b-a);
                    break;
                case "*":
                     a=s.pop();
                     b=s.pop();
                    s.push(b*a);
                    break;
                case "/":
                     a=s.pop();
                     b=s.pop();
                    s.push(b/a);
                    break;
                default:
                    s.push(Integer.parseInt(ch));


            }
              
        }
        return s.pop();
    }
}