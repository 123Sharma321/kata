package cikl;

import java.util.Arrays;

public class Kata {
//берет наальное и конечное значение и заполняет массив недостающими элементами
    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            result[i - a] = i;
        }
        return result;
    }

}

