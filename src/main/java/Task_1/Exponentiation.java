package Task_1;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println("Возведение в степень числа 3: ");
        System.out.println(expNumber(3, 0));
        System.out.println(expNumber(3, 1));
        System.out.println(expNumber(3, 2));
        System.out.println(expNumber(3, 3));
        System.out.println(expNumber(3, 4));
        System.out.println(expNumber(3, 5));

        System.out.println("Возведение в степень числа 4: ");
        System.out.println(expNumber(4, 0));
        System.out.println(expNumber(4, 1));
        System.out.println(expNumber(4, 2));
        System.out.println(expNumber(4, 3));
        System.out.println(expNumber(4, 4));
        System.out.println(expNumber(4, 5));
    }

    private static int expNumber(int number, int exp) {
        if (number == 0) {
            if (exp > 0) return 0;
            else throw new IllegalArgumentException();
        }
        if (exp == 0) { return 1; }
        if (exp == 1) { return number; }
        return number * (expNumber(number, exp - 1));
    }
}


