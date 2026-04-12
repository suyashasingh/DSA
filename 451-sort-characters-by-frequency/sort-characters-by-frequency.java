class Solution {
    public String frequencySort(String s) {

        //brute fprce approach using hashmap+frequency sort+ build result

        // Map<Character, Integer> hs = new HashMap<>();

        // for(char ch : s.toCharArray()){
        //     hs.put(ch, hs.getOrDefault(ch, 0)+1);
        // }
        // //build list of frequencies
        // ArrayList<Character> ls = new ArrayList<>(hs.keySet());
        // //sort on the basis of frequencies
        // Collections.sort(ls, (a, b)->hs.get(b)-hs.get(a));
        // //build result
        // StringBuilder result = new StringBuilder();
        // for(char l : ls){
        //     int count  = hs.get(l);
        //     for(int i = 0; i<count ; i++){
        //         result.append(l);
        //     }
        // }
        // return new String(result); 

        // Tc- O(n log n) -> sorting
        // Sc- O(n) -> extra list


        // Optimize approach using bucket sort

        Map<Character, Integer> hs = new HashMap<>();

        for(char ch : s.toCharArray()){
            hs.put(ch, hs.getOrDefault(ch, 0)+1);
        }

        //create frequency aaray by bucket sort

        ArrayList<Character>[] bucket = new ArrayList[s.length()+1];
        for(char c : hs.keySet()){
            int freq = hs.get(c);

            if(bucket[freq]== null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(c);
            
        }

        //building result

        StringBuilder result = new StringBuilder();

        for(int i = bucket.length-1; i>=0 ; i--){
            if(bucket[i] != null){
                for(char chr : bucket[i]){
                    for(int j = 0; j<i; j++){
                        result.append(chr);
                    }
                }
            }
        }

        return new String(result);


        
    }
}