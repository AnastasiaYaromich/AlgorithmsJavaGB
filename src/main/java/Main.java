
public class Main {
    public static void main(String[] args) {
        HashTableImpl hashTable = new HashTableImpl(5);
        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(77, "Banana"), 100);
        hashTable.put(new Product(67, "Carrot"), 34);
        hashTable.put(new Product(60, "Lemon"), 250);
        hashTable.put(new Product(51, "Milk"), 120);
        hashTable.put(new Product(47, "Pineapple"), 228);
        hashTable.put(new Product(21, "Potato"), 67);
        hashTable.put(new Product(33, "Apple"), 220);
        hashTable.put(new Product(28, "Apricot"), 75);
        hashTable.put(new Product(14, "Kiwi"), 84);
        hashTable.put(new Product(2, "Cucumber"), 89);
        hashTable.put(new Product(15, "Pine"), 270);
        hashTable.put(new Product(37, "Tomato"), 190);
        hashTable.put(new Product(46, "Meat"), 230);
        hashTable.put(new Product(56, "Chicken"), 180);
        hashTable.put(new Product(76, "Beef"), 330);
        hashTable.put(new Product(99, "Ice-Cream"), 45);
        hashTable.put(new Product(109, "Cookie"), 190);
        hashTable.put(new Product(22, "Almond"), 99);
        hashTable.put(new Product(94, "Asparagus"), 33);
        hashTable.put(new Product(13, "Bacon"), 185);
        hashTable.put(new Product(55, "Berry"), 114);
        hashTable.put(new Product(75, "Black olive"), 140);

        hashTable.display();

        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));
        System.out.println("Cost chicken is " + hashTable.get(new Product(56, "Chicken")));
        System.out.println("Cost meat is " + hashTable.get(new Product(46, "Meat")));
        System.out.println("Cost ice-cream is " + hashTable.get(new Product(99, "Ice-Cream")));

        hashTable.removeItem(new Product(67, "Carrot"));
        hashTable.removeItem(new Product(15, "Pine"));

        hashTable.display();
    }
}
