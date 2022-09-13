class MyHashSet {
    HashSet<Integer> hm ; 
    // LinkedList<Integr>
    public MyHashSet() {
        hm = new HashSet<>();
    }
    
    public void add(int key) {
        hm.add(key);
    }
    
    public void remove(int key) {
        hm.remove(key);
    }
    
    public boolean contains(int key) {
      return   hm.contains(key);   
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */