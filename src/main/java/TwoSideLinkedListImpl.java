import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E>, Iterable<E> {
    protected Node<E> last;

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size == 1) {
            last = first;
        }
    }

    @Override
    public void insertLast(E value) {
        Node<E> newNode = new Node<>(value, null);
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if (isEmpty()) {
            last = null;
        }

        return removedValue;
    }

    @Override
    public E removeLast() {
        Node<E> current = first;
        Node<E> prev = null;

        while (current != null) {
            if(current.next == null) {
                Node<E> removerNode = current;
                last = prev;
                last.next = null;
                size--;
                break;
            }
            prev = current;
            current = current.next;
        }
        return current.item;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = first;
        Node<E> prev = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == first) {
            removeFirst();
            return true;
        } else if(current == last) {
            last = prev;
            last.next = null;
        }
        prev.next = current.next;

        current.next = null;
        size--;

        return true;
    }

    @Override
    public E getLast() {
        return last.item;
    }

    public Iterator<E> iterator() {
        return new TwoSideLinkedListImpl.LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private final TwoSideLinkedListImpl<E> list;
        private Node<E> current;
        private Node<E> previous;

        public LinkedListIterator() {
            this.list = TwoSideLinkedListImpl.this;
            reset();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E nextValue = current.item;
            previous = current;
            current = current.next;
            return nextValue;
        }

        @Override
        public void remove() {
            if (previous == null) {
                list.first = current.next;
                reset();
            } else {
                previous.next = current.next;
                if (!hasNext()) {
                    reset();
                } else {
                    current = current.next;
                }
            }
        }
        public void reset() {
            current = list.first;
            previous = null;
        }
    }
}
