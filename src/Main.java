import org.apache.commons.lang3.time.StopWatch;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    static Random random = new Random();
    static StopWatch stopWatch = new StopWatch();
    static DecimalFormat format = new DecimalFormat("#.#################");


    public static void main(String[] args) {

        int[] wygenerowany1;
        int[] wygenerowany2;
        wygenerowany1 = generujCiag(random, 100000);
        wygenerowany2 = wygenerowany1.clone();

        int[] test1 = {90, 63, 42, 93, 96, 41};
        int[] test2 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] test23 = {6, 5, 10, 3, 1, 8, 7, 2, 4, 9};
        int[] test44 = {6, 4, 1, 9, 5, 3};
        int[] test11 = {3, 4, 1, 2, 0};
        int[] test = wygenerowany1.clone();

        System.out.println("Wygenerowany: ");
        drukujListe(wygenerowany1);
        System.out.println();

        System.out.println("Z prezentacji: ");
        drukujListe(test);
        System.out.println();


        wybieranieSort(test.clone());


        System.out.println();


        wstawianieSort(test.clone());

        System.out.println();

        bubbleSort(test.clone());

    }


    private static double convertTimeToSeconds(long time) {
        return 1.0 * (time) / 1000000000;
    }

    private static int[] generujCiag(Random rnd, int size) {
        int[] tmp = new int[size];

        for (int i = 0; i < size; i++) {
            int tmp_int = rnd.nextInt(100) + i % 2;
            tmp[i] = tmp_int;
        }
        return tmp;
    }

    private static int[] generujCiagSpecjalny(Random rnd, int first_element, int size, boolean direction) {
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

    private static void drukujListe(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("]\n");
    }

    private static void wybieranieSort(int[] ciag) {
        int porownania = 0;
        int przesuniecia = 0;
        int[] array = ciag;

        //start stopwatch
        stopWatch.start();

        //sortowanie
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[min_index]) {
                    min_index = j;
                }
            }
            int x = array[min_index];
            array[min_index] = array[i];
            array[i] = x;
        }


        stopWatch.stop();
        System.out.println("Sortowanie przez WYBIERANIE: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms");
        System.out.print(" | Porownania: " + porownania);
        System.out.print(" | Przesuniecia: " + przesuniecia);
        System.out.print("]\n");
        drukujListe(array);
        stopWatch.reset();

    }

    private static void wstawianieSort(int[] ciag) {
        int porownania = 0;
        int przesuniecia = 0;
        int[] array = ciag;

        //start stopwatch
        stopWatch.start();

        //sortowanie
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }


        stopWatch.stop();
        System.out.println("Sortowanie przez WSTAWIANIE: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms");
        System.out.print(" | Porownania: " + porownania);
        System.out.print(" | Przesuniecia: " + przesuniecia);
        System.out.print("]\n");
        drukujListe(array);
        stopWatch.reset();
    }

    private static void bubbleSort(int[] ciag) {
        int porownania = 0;
        int przesuniecia = 0;
        int[] array = ciag;

        //start stopwatch
        stopWatch.start();

        //sortowanie

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }


        stopWatch.stop();
        System.out.println("Sortowanie przez BĄBELKOWE: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms");
        System.out.print(" | Porownania: " + porownania);
        System.out.print(" | Przesuniecia: " + przesuniecia);
        System.out.print("]\n");
        drukujListe(array);
        stopWatch.reset();
    }
}
