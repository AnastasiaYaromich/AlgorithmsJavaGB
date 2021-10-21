package Task_2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Книга", 2, 80));
        items.add(new Item("Ноутбук", 3, 200));
        items.add(new Item("Кот", 5, 250));
        items.add(new Item("Часы", 1, 150));
        items.add(new Item("Зарядка", 2, 70));

        Backpack backpack = new Backpack(5);
        backpack.calcBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println("Лучшая цена: " + backpack.getBestPrice());
    }
    }

