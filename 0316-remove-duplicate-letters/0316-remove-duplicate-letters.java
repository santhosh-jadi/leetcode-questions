class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        boolean b[]=new boolean[26];
        int a[]=new int[26];
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<n;i++){
            int indx=s.charAt(i)-'a';
            if(b[indx]==true){
                continue;
            }
            while(!st.isEmpty()&&s.charAt(i)<st.peek()&&  a[st.peek() - 'a'] > i){
                b[st.pop()-'a']=false;
            }
            st.push(s.charAt(i));
            b[indx]=true;
        }
        StringBuilder br=new StringBuilder();
        while(!st.isEmpty()){
            br.append(st.pop());
        }
        return br.reverse().toString();
        
    }
}