class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> h=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        h.add(nums[0]);
        l.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int n=nums[i];
            if(h.getLast()>l.getLast()){
                h.add(n);
            }
            else{
                l.add(n);
            }
        }
        int a[]=new int[nums.length];
        int k=0;
        for(int i:h){
            a[k++]=i;
        }
        for(int i:l){
             a[k++]=i;
        }
         return a;

    }
}