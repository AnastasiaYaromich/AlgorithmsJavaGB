
class LinkedList<K, V>  {
  protected Entry<K, V> first;
    protected int size;

    public void insertFirst(K key, V value) {
        first = new Entry<>(key, value, first);
        size++;
    }

    public K removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Entry<K, V> removerNode = first;
        first = removerNode.next;
        removerNode.next = null;
        size--;
        return removerNode.key;
    }

    public K remove(K key) {
        Entry<K, V> current = first;
        Entry<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                break;
            }
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return null;
        } else if (current == first) {
            return removeFirst();
        }
        prev.next = current.next;
        current.next = null;
        size--;
        return current.key;
    }

    public Entry find(K key) {
        Entry<K, V> current = first;
        while (current != null) {
            if(((Product)current.key).equals((Product)key))
                return current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(K key) {
        Entry<K, V> current = first;
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Entry<K, V> current = first;
        while (current != null) {
            sb.append(current);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    }



