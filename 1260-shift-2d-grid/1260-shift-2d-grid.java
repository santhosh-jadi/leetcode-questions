class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        while(k>0){
            int l=grid[n-1][m-1];
            for(int i=n-1 ;i>=0;i--){
                for(int j=m-1;j>=0;j--){
                     if(i==0&&j==0){
                          grid[i][j] = l;
                     }
                    else if(j==0){
                        grid[i][j]=grid[i-1][m-1];
                    }
                    else{
                        grid[i][j]=grid[i][j-1];
                    }

                }
            }
         
            k--;

                               
        }
        List<List<Integer>> mn=new ArrayList<>();
        for(int i=0;i<n;i++){
        List<Integer> nm=new ArrayList<>();
          for(int j=0;j<m;j++){
            nm.add(grid[i][j]);
          }
        mn.add(nm);
        }
     return mn;
      
        
    }
    
}