class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        HashMap<String,List<String>> h=new HashMap<>();
        for(String ch:strs){
            char a[]=ch.toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            h.putIfAbsent(s,new ArrayList<>());
            h.get(s).add(ch);
        }
        for(String c:h.keySet()){
            l.add(h.get(c));
        }
        return l;

    }
}