class Pair
{
    int key;
    int value;
    Pair(int key,int value)
    {
        this.key = key;
        this.value = value;
    }
}
class node
{
    Pair pair;
    node prev;
    node next;
    node(Pair pair)
    {
        this.pair = pair;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    node head; 
    node tail;
 
    HashMap<Integer,node> map;
    int capacity;

    public LRUCache(int capacity) 
    {
        head = new node(new Pair(-1,-1));
        tail = new node(new Pair(-1,-1));
           head.next = tail;
    tail.prev = head;
    this.capacity = capacity;
    map = new HashMap<>();
    }

    public void insertafterhead(node n)
    {
        n.prev = head;
        n.next = head.next;
        head.next.prev = n;
        head.next = n;
    }
    public void delete(node n)
    {
        n.prev.next = n.next;
        n.next.prev = n.prev; 
    }


    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        node n = map.get(key);
        delete(n);
        insertafterhead(n);
        return n.pair.value;
        
    }
    
    public void put(int key, int value) {
        Pair p = new Pair(key,value);
        node n = new node(p);
        if(map.containsKey(key))
        {
            node t = map.get(key);
            delete(t);
            map.remove(key);
        }
        if(map.size()==capacity)
        {
            
            node d = tail.prev;
            delete(d);
            map.remove(d.pair.key);
        }
       
        map.put(key,n);
        insertafterhead(n);
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */