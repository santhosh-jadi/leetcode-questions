class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> h = new HashMap<>();
        for(int a:nums){
            h.put(a,h.getOrDefault(a,0)+1);

        }
        for(int k:h.keySet()){
            if(h.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}