package pl.wiktor.generator;

import java.util.Random;

public class ArrayGenerator {

    public int[] generujCiag(Random rnd, int size) {
        int[] tmp = new int[size];

        for (int i = 0; i < size; i++) {
            int tmp_int = rnd.nextInt(4532) + 1;
            tmp[i] = tmp_int;
        }
        return tmp;
    }

    public int[] generujCiagSpecjalny(Random rnd, int first_element, int size, boolean direction) {
        int[] tmp = new int[size];
        tmp[0] = first_element;

        int tmp_int = 0;
        for (int i = 1; i < size + 1; i++) {
            if (direction) {
                tmp_int = tmp[i - 1] + rnd.nextInt(15) + i % 2;
            } else if (!direction) {
                tmp_int = tmp[i - 1] - rnd.nextInt(15) + i % 2;
            }
            tmp[i] = tmp_int;
        }
        return tmp;
    }
}
