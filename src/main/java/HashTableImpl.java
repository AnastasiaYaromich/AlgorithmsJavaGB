
public class HashTableImpl<K, V> implements HashTable<K, V> {
     private LinkedList<K, V> data[];
     protected int size;

     public HashTableImpl(int initialCapacity) {
         size = initialCapacity * 2;
         this.data = new LinkedList[size];
         for (int i = 0; i < data.length; i++) {
             data[i] = new LinkedList<>();
         }
     }

    @Override
    public boolean put(K key, V value) {
        int index = hashFunc(key);
      data[index].insertFirst(key, value);
        return true;
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode()) % data.length;
    }

    @Override
    public V get(K key) {
         int index = indexOf(key);
         LinkedList<K, V> item = data[index];
            Entry<K, V> entry = item.find(key);
            return entry.getValue();
    }

    @Override
    public K removeItem(K key) {
         int index = indexOf(key);
        LinkedList<K, V> item = data[index];
         return item.remove(key);
    }

    private int indexOf(K key) {
        int index = hashFunc(key);
        if(index > -1) { return index; }
        return - 1;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public void display() {
        System.out.println("--------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]%n", i, data[i]);
        }
        System.out.println("--------------------------");
    }
    }
