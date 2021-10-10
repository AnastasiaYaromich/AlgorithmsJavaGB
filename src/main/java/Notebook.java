// Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 5000 штук.
// Условия для сортировки:
// `1)` по цене. От 500 до 3000 долларов с шагом в 50
//  если цена равная, то
// `2)` по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
//  если памяти тоже равное количество, то `3)` по производителю:
//  Lenuvo > Asos > MacNote > Eser > Xamiou
//  Добиваться максимально оптимальной сложности О-большая
import java.util.Arrays;
import java.util.Random;

public class Notebook {
    private int price;
    private int ram;
    private static int minPrice = 500;
    private static int minRam = 4;
    private static int maxPrice = 2000;
    private static int maxRam = 24;
    public static String[] producer = new String[] {"Xiaomi", "Eser", "MacNote", "Asus", "Lenovo"};
    private String prod;
    private static final Random random = new Random();
    public static boolean isShuffle = false;

    public Notebook(int price, int ram, String prod) {
        this.price = price;
        this.ram = ram;
        this.prod = prod;
    }

    public int getPrice() { return price; }
    public int getRam() { return ram; }
    public String getProd() { return prod; }

    public String toString() {
        return  "[price: " + price + ", ram: " +  ram + ", producer: " + getProd() + "]";
    }

    public static Notebook[] getArrNb(int length, int gapPrice, int gapRam) {
        Notebook[] nb = new Notebook[length];
        nb[0] = new Notebook(minPrice, minRam, producer[random.nextInt(producer.length)]);
        for (int i = 1; i < length; i++) {
            nb[i] = new Notebook(nb[i - 1].price + gapPrice, nb[i - 1].ram + gapRam, producer[random.nextInt(producer.length)]);
            if(nb[i].price > maxPrice) {
                nb[i].price = minPrice; }
            if(nb[i].ram > maxRam) {
                nb[i].ram = minRam;
            }
        }
        if (!isShuffle) {
            shuffleArray(nb);
        }
        return nb;
    }

    public static void shuffleArray(Notebook[] nb) {
        if(isShuffle) {
            return;
        }
        int n = nb.length;
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(nb, i, change);
        }
    }

    private static void swap(Notebook[] nb, int i, int change) {
        Notebook nb1 = nb[i];
        nb[i] = nb[change];
        nb[change] = nb1;
    }
}