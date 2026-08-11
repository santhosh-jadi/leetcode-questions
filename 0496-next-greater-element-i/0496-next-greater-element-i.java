class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int a[]=new int[nums1.length];
    //     int k=0;
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i]==nums2[j]){
    //                 a[k++]=nxtnu(j,nums2);
    //                 break;
    //             }
    //         }
    //     }
    //     return a;
        
    // }
    
      HashMap<Integer,Integer> h=new HashMap<>();
      int k=0;
      for(int i=0;i<nums2.length;i++){
          h.put(nums2[i],i);
      }
      int a[]=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
            a[k++]=nxtnu(h.get(nums1[i]),nums2);
      }
      return a;
    }
     public static int nxtnu(int i,int ar[]){
         int m=i;
        for(int j=i+1;j<ar.length;j++){
        if(ar[m]<ar[j]){
            return ar[j];
            }
       }
     return -1;
    }
}