public interface HashTable<K, V>{
    boolean put(K key, V value);
    V get(K key);
    K removeItem(K key);
    int size();
    boolean isEmpty();
    void display();
}