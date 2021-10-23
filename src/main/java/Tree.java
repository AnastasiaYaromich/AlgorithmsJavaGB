
public interface Tree<E extends Comparable<? super E>> {
    // Добавить элемент в дерево
    boolean add(E value);
    // Проверить существует ли данный элемент в каком-либо узле.
    boolean contains(E value);
    // Удалить элемент
    boolean remove(E value);
    // Проверить пустое ли дерево
    boolean isEmpty();
    // Узнать размер дерева
    int size();
    // Вывести дерево
    void display();

}
