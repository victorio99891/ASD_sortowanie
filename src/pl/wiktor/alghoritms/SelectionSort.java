package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class SelectionSort {

    public void wybieranieSort(int[] ciag, StopWatch stopWatch, Printer printer) {
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
        printer.drukujListe(array);
        stopWatch.reset();

    }


}
