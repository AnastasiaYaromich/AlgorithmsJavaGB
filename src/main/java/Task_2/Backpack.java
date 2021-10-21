package Task_2;
import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxWeight;
    private int bestPrice;
    private List<Item> Items = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void calcBestSet(List<Item> items) {
        if(items.isEmpty()) {
            return;
        }
        bestSet(items);
        for (int i = 0; i < items.size(); i++) {
            List<Item> copyItems = new ArrayList<>(items);
            copyItems.remove(i);
            calcBestSet(copyItems);
        }
    }

    public void bestSet(List<Item> items) {
        int sumPrice = calcPrice(items);
        int sumWeight = calcWeight(items);
        if(sumWeight <= maxWeight && sumPrice > bestPrice) {
            Items = items;
            bestPrice = sumPrice;
        }
            }

    public int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice = sumPrice + item.getPrice();
        }
        return sumPrice;
    }

    public int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item: items) {
           sumWeight = sumWeight + item.getWeight();
        }
        return sumWeight;
    }

    public List<Item> getBestSet() {
        return Items;
    }

    public int getBestPrice() {
        return bestPrice;
    }
}
