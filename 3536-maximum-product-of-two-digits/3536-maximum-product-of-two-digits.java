class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        while(n!=0){
            l.add(n%10);
            n/=10;
        }
        l.sort(Comparator.reverseOrder());
        
        return l.get(0)*l.get(1);
        
    }
}