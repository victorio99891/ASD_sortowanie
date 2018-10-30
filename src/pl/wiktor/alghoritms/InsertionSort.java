package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class InsertionSort {
    public int[] wstawianieSort(int[] ciag, StopWatch stopWatch, Printer printer) {
        int porownania = 0;
        int przesuniecia = 0;
        int zamiany = 0;
        int[] array = ciag;

        //start stopwatch
        stopWatch.start();


        //sortowanie
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int orderIndex = i - 1;

            if (key > array[orderIndex]) {
                zamiany--;
            }

            while (orderIndex >= 0 && array[orderIndex] > key) {
                porownania++;
                przesuniecia++;
                array[orderIndex + 1] = array[orderIndex];
                orderIndex--;
            }


            zamiany++;
            porownania++;
            array[orderIndex + 1] = key;
        }


        stopWatch.stop();
        System.out.println("Sortowanie przez WSTAWIANIE: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms" + " =  " + stopWatch.getTime(TimeUnit.SECONDS) + " s");
        //System.out.print(" | > Porownania: " + porownania);
        //System.out.print(" | > Przesuniecia: " + przesuniecia);
        //System.out.print(" | Zamiany: " + zamiany);
        System.out.print("]\n");
        //printer.drukujSprawdzenie(array);
        stopWatch.reset();

        return array;
    }

    public void insertionSort(int[] list, Printer printer) {
        int comps = 0, swaps = 0;

        for (int i = 1; i < list.length; i++) {

            int j = i;

            // compare i with sorted elements and insert it
            // sorted elements: [0..i-1]
            while (j > 0 && list[j] < list[j - 1]) {

                int temp = list[j];
                list[j] = list[j - 1];
                list[j - 1] = temp;

                swaps++;
                comps++;  // loop condition true

                j--;
            }
            comps++; // checking loop condition when false
        }

        printer.drukujListe(list);
        System.out.println("Comparisons: " + comps
                + " Swaps: " + swaps);
    }
}
