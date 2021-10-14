package Task_2_3;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (head == HEAD_DEFAULT) {
            head = data.length;
        }
        data[--head] = value;
        size++;
        return true;
    }


    @Override
    public boolean insertRight(E value) {
        return super.insert(value);
    }


    @Override
    public E removeLeft() {
        return super.remove();
    }


    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        if (tail == TAIL_DEFAULT)
            tail = data.length - 1;
        size--;
        E value = data[tail--];
        return value;
    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= tail; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }
        for (int i = head; i <= data.length - 1; i++) {
            sb.append(data[i]);
            if (i < data.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
