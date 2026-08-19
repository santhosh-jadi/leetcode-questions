import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> q=new LinkedList<>();
       for(int i:students){
         q.add(i);
       } 
       int i=0;
       int c=0;
       while(!q.isEmpty()){
        if(q.peek()==sandwiches[i]){
            q.poll();
            c=0;
            i++;
        }
        else{
            int k=q.poll();
            q.add(k);
            c++;
        }
        if(c==q.size()){
            break;
        }
       }
       return c;

    }
}