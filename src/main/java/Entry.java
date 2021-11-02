import java.util.Objects;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;
    Entry<K, V> prev;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Entry(K key, V value, Entry<K, V> next, Entry<K, V> prev) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public String toString() {
        return "Entry{" + "key=" + key + ", value=" + value + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry<?, ?> entry = (Entry<?, ?>) o;
        return Objects.equals(key, entry.key) && Objects.equals(value, entry.value) && Objects.equals(next, entry.next) && Objects.equals(prev, entry.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, next, prev);
    }


}