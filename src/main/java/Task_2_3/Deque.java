package Task_2_3;

public interface Deque<E>  {
    boolean insertLeft(E value);
    boolean insertRight(E value);
    E removeLeft();
    E removeRight();
    void display();
}

