class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
        
    }
    
    public boolean insert(int val) {
        //if val already exist

        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
        // if already not present in the list

        if(!map.containsKey(val)){
            return false;
        }
        //find the index of the value we need to remove;

        int index = map.get(val);
        //get the last elemt

        int lastElement = list.get(list.size() - 1);
        //put last elm at the position of value

       list.set(index, lastElement);
       //update last elemnt index
       map.put(lastElement, index);

       //remove last elem from list

       list.remove(list.size()-1);

       //remove the val from the map

       map.remove(val);
       return true;
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */