package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class QuickSortAnotherLR2 {

    public int[] quickSort(int[] ciag, StopWatch stopWatch, Printer printer) {
        int[] array = ciag;


        //start stopwatch
        stopWatch.start();

        //sortowanie
        recursiveQuickSort(array, 0, array.length - 1);


        stopWatch.stop();
        System.out.println("Sortowanie QUICK SORT x=a[(left+right)/2]: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms" + " =  " + stopWatch.getTime(TimeUnit.SECONDS) + " s");
        //System.out.print(" | > Porownania: " + porownania);
        //System.out.print(" | > Przesuniecia: " + przesuniecia);
        //System.out.print(" | Zamiany: " + zamiany);
        System.out.print("]\n");
        //printer.drukujSprawdzenie(array);
        stopWatch.reset();

        return array;
    }


    public int partition(int[] a, int left, int right) {
        int test = (left + right) / 2;
        int pivot = a[test];
        while (left <= right) {
            while (a[left] < pivot)
                left++;
            while (a[right] > pivot)
                right--;
            if (left <= right) {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }

    public void recursiveQuickSort(int[] a, int i, int j) {
        int idx = partition(a, i, j);
        if (i < idx - 1) {
            recursiveQuickSort(a, i, idx - 1);
        }
        if (j > idx) {
            recursiveQuickSort(a, idx, j);
        }
    }

}
