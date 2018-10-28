import org.apache.commons.lang3.time.StopWatch;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    static Random random = new Random();
    static StopWatch stopWatch = new StopWatch();


    public static void main(String[] args) {

        int[] wygenerowany;

        wygenerowany = generujCiag(random, 10);
        System.out.println("Wygenerowany: ");
        drukujListe(wygenerowany);
        System.out.println("-----------------------");

        int[] posortowane;

        stopWatch.start();
        posortowane = wybieranieSort(wygenerowany);
        stopWatch.stop();
        System.out.println("Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS));
        System.out.println("Wybieranie: ");
        drukujListe(posortowane);
        stopWatch.reset();

        stopWatch.start();
        posortowane = wstawianieSort(wygenerowany);
        stopWatch.stop();
        System.out.println("Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS));
        System.out.println("Wybieranie: ");
        drukujListe(posortowane);


    }

    private static int[] generujCiag(Random rnd, int size) {
        int[] tmp = new int[size + 1];
        tmp[0] = 0;
        for (int i = 1; i < size + 1; i++) {
            int tmp_int = rnd.nextInt(100) + 1;
            tmp[i] = tmp_int;
        }
        return tmp;
    }

    private static int[] generujCiagSpecjalny(Random rnd, int first_element, int size, boolean direction) {
        int[] tmp = new int[size + 1];
        tmp[0] = 0;
        tmp[1] = first_element;

        int tmp_int = 0;
        for (int i = 2; i < size + 1; i++) {
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

    private static int[] wybieranieSort(int[] ciag) {
        int[] tmp = ciag;
        for (int i = 1; i < tmp.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < tmp.length; j++) {
                if (tmp[j] < tmp[k]) {
                    k = j;
                }
            }
            int x = tmp[k];
            tmp[k] = tmp[i];
            tmp[i] = x;
        }
        return tmp;
    }

    private static int[] wstawianieSort(int[] ciag) {
        int[] tmp = ciag;

        for (int i = 1; i < ciag.length; i++) {
            int x = ciag[i];
            ciag[0] = x;
            int j = i;
            while (x < ciag[j - 1]) {
                ciag[j] = ciag[j - 1];
                j = j - 1;
            }
            ciag[j] = x;
        }


        return tmp;
    }
}
