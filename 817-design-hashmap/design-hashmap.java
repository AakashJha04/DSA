class Pair {
    int k;
    int v;
    Pair(int k, int v){
        this.k = k;
        this.v = v;
    }
}



class MyHashMap {
    List<Pair> arr;
    boolean isDuplicateKey = false;
    public MyHashMap() {
        arr = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).k == key){
                isDuplicateKey = true;
                arr.set(i, new Pair(key, value));
            }
        }
        if(isDuplicateKey == false){
            arr.add(new Pair(key, value));
        }
        isDuplicateKey = false;
    }
    
    public int get(int key) {
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i).k == key){
                return arr.get(i).v;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).k == key){
                arr.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */