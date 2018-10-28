import org.apache.commons.lang3.time.StopWatch;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    static Random random = new Random();
    static StopWatch stopWatch = new StopWatch();


    public static void main(String[] args) {

        int[] lista1;
        int[] lista2;
        int[] lista3;

        lista1 = generujCiag(random, 10);
        drukujListe(lista1);

        lista2 = generujCiagSpecjalny(random, 1, 10, true);
        //drukujListe(lista2);

        lista3 = generujCiagSpecjalny(random, 100, 10, false);
        //drukujListe(lista3);

        stopWatch.start();
        int[] posortowana = sortowaniePrzezWybieranie(10, lista1);
        stopWatch.stop();
        System.out.println("Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS));
        drukujListe(posortowana);


    }

    private static int[] generujCiag(Random rnd, int size) {
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) {
            int tmp_int = rnd.nextInt(100) + 1;
            tmp[i] = tmp_int;
        }
        return tmp;
    }

    private static int[] generujCiagSpecjalny(Random rnd, int first_element, int size, boolean direction) {
        int[] tmp = new int[size];
        tmp[0] = first_element;

        int tmp_int = 0;
        for (int i = 1; i < size; i++) {
            if (direction) {
                tmp_int = tmp[i - 1] + rnd.nextInt(10) + 1;
            } else if (!direction) {
                tmp_int = tmp[i - 1] - rnd.nextInt(10) + 1;
            }
            tmp[i] = tmp_int;
        }
        return tmp;
    }

    private static void drukujListe(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("]\n");
    }

    private static int[] sortowaniePrzezWybieranie(int size, int[] ciag) {
        int[] tmp = ciag;
        int k;
        for (int i = 1; i < size - 1; i++) {
            k = i;
            for (int j = i + 1; j < size; j++) {
                if (tmp[j] < tmp[k]) {
                    k = j;
                }
                int x = tmp[k];
                tmp[k] = tmp[i];
                tmp[i] = x;
            }
        }
        return tmp;
    }
}
