package Task_2_3;

public class Test {
    public static void main(String[] args) {
        testDeque();
        testQueue();
    }
    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(5);
        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));
        queue.display();
        System.out.println("" + "remove: " + queue.remove());
        System.out.println("" + "remove: " + queue.remove());
        queue.display();
    }

        private static void testDeque() {
            Deque<Integer> deque = new DequeImpl<>(8);
            System.out.println("add right: " + deque.insertRight(1));
            System.out.println("add right: " + deque.insertRight(2));
            System.out.println("add right: " + deque.insertRight(3));
            System.out.println("add right: " + deque.insertRight(4));
            System.out.println("add left: " + deque.insertLeft(5));
            System.out.println("add left: " + deque.insertLeft(6));
            System.out.println("add left: " + deque.insertLeft(7));
            System.out.println("add right: " + deque.insertRight(8));
            deque.display();
            System.out.println(deque.removeLeft());
            System.out.println(deque.removeRight());
            deque.display();
        }
    }



