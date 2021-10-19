
public class Main {
    public static void main(String[] args) {
      //  testLinkedList();
        testTwoSideLinkedList();
    }
    private static void testLinkedList() {
        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertFirst(9);
        linkedList.insertFirst(10);
        linkedList.insertFirst(11);
        System.out.println("Исходный список: ");
        linkedList.display();

        System.out.println("Работа итератора: ");
        for (Integer value : linkedList) {
            System.out.print("value: " + value + " ");
        }
        System.out.println();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        linkedList.removeFirst();
        linkedList.remove(3);
        System.out.println("Список после удаления некоторых элементов: ");
        linkedList.display();

        System.out.println("Работа итератора: ");
        for (Integer value : linkedList) {
            System.out.print("value: " + value + " ");
        }
    }

    private static void testTwoSideLinkedList() {
        TwoSideLinkedListImpl<Integer> linkedList = new TwoSideLinkedListImpl();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(11);
        System.out.println("Исходный двухсвязный список: ");
        linkedList.display();

        System.out.println("Работа итератора: ");
        for (Integer value : linkedList) {
            System.out.print("value: " + value + " ");
        }
        System.out.println();

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Список после удаления некоторых элементов: ");
        linkedList.display();
    }
}
