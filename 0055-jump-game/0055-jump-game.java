class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
      //  fistr
        // for(int i=0;i<n;i++){
    
        //     if(i+nums[i]==n-1){
        //         return true;
        //     }

        // }
        // return false;


      //  2nd
      //  for(int i=0;i<n;i++){
    //     int m=nums[i];
    //       if((m==0||m==1)&&n==1){
    //         return true;
    //       }
       
    //         for(int j=i+1;m!=0&&j<n;j++){
    //            if(j+nums[j]==n-1){
    //             return true;
    //             }
    //            m--;
    //         }
           
    //     }
    //     return false;
    //final greedy
    int maxapp=0;
    for(int i=0;i<n;i++){
        if(i>maxapp){
            return false;
        }
        maxapp=Math.max(maxapp,i+nums[i]);
        if(maxapp>=n-1){
            return true;
        }
        
    }    
    return false;
}
}