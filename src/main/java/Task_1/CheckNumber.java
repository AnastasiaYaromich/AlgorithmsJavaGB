package Task_1;

// 1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен
// (предыдущий + 1). Но в массиве гарантированно 1 число пропущено.
// Необходимо вывести на экран пропущенное число.

import java.util.Arrays;
import java.util.Random;

public class CheckNumber {
    int[] arr;
    Random random = new Random();

    public CheckNumber(int length) {
        this.arr = new int[length];
    }

    public int[] genArray() {
        int a = random.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (i >= a) {
                arr[i] = i + 2;
                continue;
            }
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int findAndWrite(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean num = true;
        int d = 1;
        while (start < end) {
            int base = (start + end) / 2;
            int left = arr[base] - arr[start];
            if (left > d * (base - start)) {
                if (base - start == 1)
                    return (arr[base] + arr[start]) / 2;
                end = base;
                num = false;
                continue;
            }
            int right = arr[end] - arr[base];
            if (right > d * (end - base)) {
                if (end - base == 1)
                    return (arr[end] + arr[base]) / 2;
                start = base;
                num = false;
                continue;
            }
            if (num)
                break;
        }
        return -1;
    }
}




