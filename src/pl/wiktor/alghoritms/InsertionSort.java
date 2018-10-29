package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class InsertionSort {
    public void wstawianieSort(int[] ciag, StopWatch stopWatch, Printer printer) {
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
        printer.drukujListe(array);
        stopWatch.reset();
    }
}
