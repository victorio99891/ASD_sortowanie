package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class BubbleSort {

    public void bubbleSort(int[] ciag, StopWatch stopWatch, Printer printer) {
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
        printer.drukujListe(array);
        stopWatch.reset();
    }
}
