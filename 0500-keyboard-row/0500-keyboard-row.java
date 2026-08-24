class Solution {
    public String[] findWords(String[] words) {
    
   ArrayList<Character> a1 = new ArrayList<>(
            List.of('q','w','e','r','t','y','u','i','o','p')
        );

        ArrayList<Character> a2 = new ArrayList<>(
            List.of('a','s','d','f','g','h','j','k','l')
        );

        ArrayList<Character> a3 = new ArrayList<>(
            List.of('z','x','c','v','b','n','m')
        );

        HashMap<Integer, List<Character>> h = new HashMap<>();

        h.put(1, a1);
        h.put(2, a2);
        h.put(3, a3);

        ArrayList<String> result = new ArrayList<>();

        for (String s : words) {
            String sn = s.toLowerCase();

            int row = 0;

            for (int key : h.keySet()) {
                if (h.get(key).contains(sn.charAt(0))) {
                    row = key;
                    break;
                }
            }

            boolean valid = true;

                  for (int i = 1; i < sn.length(); i++) {
                if (!h.get(row).contains(sn.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(s);
            }
        }

        return result.toArray(new String[0]);


        
    }
}