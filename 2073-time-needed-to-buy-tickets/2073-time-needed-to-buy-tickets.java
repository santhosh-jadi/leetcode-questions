class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        int t=0;
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int p=q.poll();
            tickets[p]--;
            t++;
            if(p==k&&tickets[k]==0){
                return t;
            }
            if(tickets[p]>0){
                q.add(p);
            }
        }
        return -1;
    }
}