package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class QuickSortaL {

    public void quickSort(int[] ciag, StopWatch stopWatch, Printer printer) {
        int porownania = 0;
        int przesuniecia = 0;
        int zamiany = 0;
        int[] array = ciag;

        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());

        //start stopwatch
        stopWatch.start();

        //sortowanie
        qsort(array, 0, array.length - 1, Integer::compareTo);

        stopWatch.stop();
        System.out.println("Sortowanie QUICK SORT x=a[left]: ");
        System.out.print("[Function time: " + stopWatch.getTime(TimeUnit.MILLISECONDS) + " ms" + " =  " + stopWatch.getTime(TimeUnit.SECONDS) + " s");
        //System.out.print(" | > Porownania: " + porownania);
        //System.out.print(" | > Przesuniecia: " + przesuniecia);
        //System.out.print(" | Zamiany: " + zamiany);
        System.out.print("]\n");
        //printer.drukujSprawdzenie(array);
        stopWatch.reset();

    }


    private static void swap(int array[], int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static <E> int partition(int array[], int begin, int end, Comparator<? super Integer> cmp) {
        //int index = (begin+end)/2;
        int index = begin;
        int pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (cmp.compare(array[i], pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return (index);
    }

    private static <E> void qsort(int array[], int begin, int end, Comparator<? super Integer> cmp) {
        if (end > begin) {
            int index = partition(array, begin, end, cmp);
            qsort(array, begin, index - 1, cmp);
            qsort(array, index + 1, end, cmp);
        }
    }

    public static <E> void sort(int array[], Comparator<? super Integer> cmp) {
        qsort(array, 0, array.length - 1, cmp);
    }
}
