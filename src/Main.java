import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.alghoritms.*;
import pl.wiktor.generator.ArrayGenerator;
import pl.wiktor.printer.Printer;

import java.util.Random;

public class Main {


    public static Random random = new Random();
    public static StopWatch stopWatch = new StopWatch();
    public static Printer printer = new Printer();
    public static ArrayGenerator arrayGenerator = new ArrayGenerator();

    public static void main(String[] args) {

        int[] wygenerowany = arrayGenerator.generujCiag(random, 10);

        //sprawozdanie
        int[] test1 = {46, 82, 120, 99, 93, 63, 101, 79, 114, 102};


        int[] test = wygenerowany.clone();

        System.out.println();
        System.out.println();

        // CIAG 10
        System.out.println("CIAG LICZBOWY n = 10:");
        System.out.println("LOSOWY:");
        int[] losowy10 = arrayGenerator.generujCiag(random, 10);
        printer.drukujMaly(losowy10, 10);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy10 = new QuickSort2().quickSort(losowy10.clone(), stopWatch, printer);
        printer.drukujMaly(niemalejacy10, 10);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy10 = new SelectionSort().wybieranieOdwrotnieSort(losowy10.clone(), stopWatch, printer);
        printer.drukujMaly(nierosnacy10, 10);
        System.out.println();
        System.out.println();

        // CIAG 1000
        System.out.println("CIAG LICZBOWY n = 1.000:");
        System.out.println("LOSOWY:");
        int[] losowy1000 = arrayGenerator.generujCiag(random, 1000);
        printer.drukuj10(losowy1000, 1000);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy1000 = new QuickSort2().quickSort(losowy1000.clone(), stopWatch, printer);
        printer.drukuj10(niemalejacy1000, 1000);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy1000 = new SelectionSort().wybieranieOdwrotnieSort(losowy1000.clone(), stopWatch, printer);
        printer.drukuj10(nierosnacy1000, 1000);
        System.out.println();
        System.out.println();

        // CIAG 1000
        System.out.println("CIAG LICZBOWY n = 100.000:");
        System.out.println("LOSOWY:");
        int[] losowy100000 = arrayGenerator.generujCiag(random, 100000);
        printer.drukuj10(losowy100000, 100000);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy100000 = new QuickSort2().quickSort(losowy100000.clone(), stopWatch, printer);
        printer.drukuj10(niemalejacy100000, 100000);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy100000 = new SelectionSort().wybieranieOdwrotnieSort(losowy100000.clone(), stopWatch, printer);
        printer.drukuj10(nierosnacy100000, 100000);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("SORTOWANIE CIĄGU n = 10");
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEMALEJĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(niemalejacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(losowy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(nierosnacy10.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("SORTOWANIE CIĄGU n = 1.000");
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEMALEJĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(niemalejacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(losowy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(nierosnacy1000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===================================================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("SORTOWANIE CIĄGU n = 100.000");
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEMALEJĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(niemalejacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaL().quickSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new QuickSortaLR2().quickSort(losowy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        new InsertionSort().wstawianieSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new SelectionSort().wybieranieSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new BubbleSort().bubbleSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        new MergeSort().mergeSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        int[] testowy = new QuickSortAnother().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(testowy);
        // new QuickSortaL().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        //new QuickSortaLR2().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("KONIEC!");


       /* int[] test1 = {90, 63, 42, 93, 96, 41};
        int[] test2 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] test546 = {6, 5, 10, 3, 1, 8, 7, 2, 4, 9};
        int[] test345 = {6, 4, 1, 9, 5, 3};
        int[] test99 = {3, 4, 1, 2, 0};
        int[] test454 = {4, 3, 2, 5, 7, 1, 9};
        int[] test3455 = {8, 4, 2, 1, 5, 6, 9, 3, 0, 7};
        int[] test23422 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};*/
        int[] test12 = {6, 4, 1, 9, 5, 3};
        arrayGenerator.sprawdzCzyPosortowany(test12);
        int[] test23 = {0, 1, 2, 3, 4, 5};
        arrayGenerator.sprawdzCzyPosortowany(test23);
        /*System.out.println("Wygenerowany: ");
        printer.drukujListe(wygenerowany);
        System.out.println();

        System.out.println("Wygenerowany: ");
        printer.drukujListe(test);
        System.out.println();*/


       /* //WBIERANIE
        new SelectionSort().wybieranieSort(test.clone(), stopWatch, printer);
        new SelectionSort().wybieranieOdwrotnieSort(test.clone(), stopWatch, printer);
        System.out.println();
        //WSTAWIANIE
        new InsertionSort().wstawianieSort(test.clone(), stopWatch, printer);
        System.out.println();
        //BUBBLE
        new BubbleSort().bubbleSort(test.clone(), stopWatch, printer);
        System.out.println();
        //SCALANIE
        new MergeSort().mergeSort(test.clone(), stopWatch, printer);
        System.out.println();
        //QUICKSORT
        new QuickSortaL().quickSort(test.clone(), stopWatch, printer);
        System.out.println();
        new QuickSort2().quickSort(test.clone(), stopWatch, printer);
        System.out.println();*/

    }

}
