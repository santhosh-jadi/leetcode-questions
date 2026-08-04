class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int m=Integer.MIN_VALUE;
        for(int k:nums){
            m=Math.max(m,k);
        }
        int ma=Integer.MAX_VALUE;
        for(int k:nums){
            ma=Math.min(ma,k);
        }
        ArrayList<Integer> l=new ArrayList<>();
        int k=0;
        for(int i=ma;i<=m&&k<n;i++){
           if(nums[k]==i){
            k++;
           }
           else{
             l.add(i);  
           }
        }
        return l;
    
    }
}