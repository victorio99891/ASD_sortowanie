package pl.wiktor.alghoritms;

import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.printer.Printer;

import java.util.concurrent.TimeUnit;

public class QuickSort2 {

    public int[] quickSort(int[] ciag, StopWatch stopWatch, Printer printer) {
        int[] array = ciag;

        //start stopwatch


        //sortowanie

        sort(array, 0, array.length - 1);


        return array;
    }

    /**
     * Quick sort the given array in ascending order
     *
     * @param array
     */
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * Quick sort the given array starting from index
     * {@code l} to {@code r}
     * <p>
     * Uses the first element in the array as the pivot
     *
     * @param array
     * @param l
     * @param r
     */
    private void sort(int[] array, int l, int r) {
        if (l < r) {
            // select pivot element (left-most)
            //int x = (array[l+r])/2;
            int pivot = array[l];
            // partition and shuffle around pivot
            int i = l;
            int j = r;
            while (i < j) {
                // move right to avoid pivot element
                i += 1;
                // scan right: find elements greater than pivot
                while (i <= r && array[i] < pivot) {
                    i += 1;
                }
                // scan left: find elements smaller than pivot
                while (j >= l && array[j] > pivot) {
                    j -= 1;
                }
                if (i <= r && i < j) {
                    // swap around pivot
                    swap(array, i, j);
                }
            }
            // put pivot in correct place
            swap(array, l, j);
            // sort partitions
            sort(array, l, j - 1);
            sort(array, j + 1, r);
        }
    }

    /**
     * Swap elements at indexes {@code i} and {@code j}
     * in the give array
     *
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array, int i, int j) {
        if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
