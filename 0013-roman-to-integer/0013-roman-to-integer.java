class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int su=0;
        for(int i=0;i<n;i++){
           int c=map.get(s.charAt(i));
         if (i+1<n&&c<map.get(s.charAt(i+1))){
                su-=c;
            }else{
                su+=c;
            }
        }
        return su;
    }
}