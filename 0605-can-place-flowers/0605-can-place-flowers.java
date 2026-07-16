class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int k=0;
        // for(int i=0;i<flowerbed.length;i++){
        //     if(flowerbed[i]==1){
        //        k=i;
        //     }
        // }
        // int m=k;
        // int nn=0;
        // while(k<flowerbed.length-2){
            
        //      if(flowerbed[k+2]==0){
        //         nn++;
        //      }
        //      k++;
        // }
        //  while(m>2){
            
        //      if(flowerbed[m-2]==0){
        //         nn++;
        //      }
        //      m--;
        // }
        // return n==(nn-1);
        for(int i = 0; i < flowerbed.length; i++){

            if(flowerbed[i] == 0){

                int left = (i == 0) ? 0 : flowerbed[i-1];
                int right = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];

                if(left == 0 && right == 0){
                    flowerbed[i] = 1;
                    n--;

                    if(n == 0)
                        return true;
                }
            }
        }

        return n <= 0;
    }
}