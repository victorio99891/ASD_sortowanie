package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class BubbleSort {

    public void bubbleSort(int[] ciag, StopWatch stopWatch, Printer printer) {
        int porownania = 0;
        int przesuniecia = 0;
        int zamiany = 0;
        int[] array = ciag;

        //start stopwatch
        stopWatch.start();

        //sortowanie

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                porownania++;
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    zamiany++;
                }

            }
        }


        stopWatch.stop();
        System.out.println("Sortowanie przez BĄBELKOWE: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms" + " =  " + stopWatch.getTime(TimeUnit.SECONDS) + " s");
        //System.out.print(" | > Porownania: " + porownania);
        //System.out.print(" | Przesuniecia: " + przesuniecia);
        //System.out.print(" | > Zamiany: " + zamiany);
        System.out.print("]\n");
        //printer.drukujSprawdzenie(array);
        stopWatch.reset();
    }
}
