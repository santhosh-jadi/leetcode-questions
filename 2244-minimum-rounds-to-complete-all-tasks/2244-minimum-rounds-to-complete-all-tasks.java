class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:tasks){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        int c=0;
        for(int key:map.keySet()){
            int fr=map.get(key);
            if(fr==1){
                return -1;
            }
            else if(fr%3==0){
                c+=fr/3;
            }
            else {
                c+=fr/3+1;
            }
        }
       return c;
        
    }
}