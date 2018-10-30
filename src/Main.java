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
        //int[] test1 = {46, 82, 120, 99, 93, 63, 101, 79, 114, 102};


        //int[] test = wygenerowany.clone();

        System.out.println();
        System.out.println();

        // CIAG 10
        System.out.println("CIAG LICZBOWY n = 10:");
        System.out.println("LOSOWY:");
        int[] losowy10 = arrayGenerator.generujCiag(random, 10);
        printer.drukujMaly(losowy10, 10);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy10 = new QuickSortAnotherTEST().quickSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(niemalejacy10);
        printer.drukujMaly(niemalejacy10, 10);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy10 = new SelectionSort().wybieranieOdwrotnieSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowanyODWROTNIE(nierosnacy10);
        printer.drukujMaly(nierosnacy10, 10);
        System.out.println();
        System.out.println();

        // CIAG 1000
        System.out.println("CIAG LICZBOWY n = 1.000:");
        System.out.println("LOSOWY:");
        int[] losowy1000 = arrayGenerator.generujCiag(random, 1000);
        printer.drukuj10(losowy1000, 1000);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy1000 = new QuickSortAnotherTEST().quickSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(niemalejacy1000);
        printer.drukuj10(niemalejacy1000, 1000);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy1000 = new SelectionSort().wybieranieOdwrotnieSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowanyODWROTNIE(nierosnacy1000);
        printer.drukuj10(nierosnacy1000, 1000);
        System.out.println();
        System.out.println();

        // CIAG 1000
        System.out.println("CIAG LICZBOWY n = 100.000:");
        System.out.println("LOSOWY:");
        int[] losowy100000 = arrayGenerator.generujCiag(random, 100000);
        printer.drukuj10(losowy100000, 100000);
        System.out.println("NIEMALEJACY:");
        int[] niemalejacy100000 = new QuickSortAnotherTEST().quickSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(niemalejacy100000);
        printer.drukuj10(niemalejacy100000, 100000);
        System.out.println("NIEROSNACY:");
        int[] nierosnacy100000 = new SelectionSort().wybieranieOdwrotnieSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowanyODWROTNIE(nierosnacy100000);
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
        int[] test1 = new InsertionSort().wstawianieSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test1);
        System.out.println();
        System.out.println();
        int[] test2 = new SelectionSort().wybieranieSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test2);
        System.out.println();
        System.out.println();
        int[] test3 = new BubbleSort().bubbleSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test3);
        System.out.println();
        System.out.println();
        int[] test4 = new MergeSort().mergeSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test4);
        System.out.println();
        System.out.println();
        int[] test5 = new QuickSortAnother().quickSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test5);
        System.out.println();
        System.out.println();
        int[] test6 = new QuickSortAnotherLR2().quickSort(niemalejacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test6);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test7 = new InsertionSort().wstawianieSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test7);
        System.out.println();
        System.out.println();
        int[] test8 = new SelectionSort().wybieranieSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test8);
        System.out.println();
        System.out.println();
        int[] test9 = new BubbleSort().bubbleSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test9);
        System.out.println();
        System.out.println();
        int[] test10 = new MergeSort().mergeSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test10);
        System.out.println();
        System.out.println();
        int[] test11 = new QuickSortAnother().quickSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test11);
        System.out.println();
        System.out.println();
        int[] test12 = new QuickSortAnotherLR2().quickSort(losowy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test12);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test13 = new InsertionSort().wstawianieSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test13);
        System.out.println();
        System.out.println();
        int[] test14 = new SelectionSort().wybieranieSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test14);
        System.out.println();
        System.out.println();
        int[] test15 = new BubbleSort().bubbleSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test15);
        System.out.println();
        System.out.println();
        int[] test16 = new MergeSort().mergeSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test16);
        System.out.println();
        System.out.println();
        int[] test17 = new QuickSortAnother().quickSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test17);
        System.out.println();
        System.out.println();
        int[] test18 = new QuickSortAnotherLR2().quickSort(nierosnacy10.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test18);
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
        int[] test19 = new InsertionSort().wstawianieSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test19);
        System.out.println();
        System.out.println();
        int[] test20 = new SelectionSort().wybieranieSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test20);
        System.out.println();
        System.out.println();
        int[] test21 = new BubbleSort().bubbleSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test21);
        System.out.println();
        System.out.println();
        int[] test22 = new MergeSort().mergeSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test22);
        System.out.println();
        System.out.println();
        int[] test23 = new QuickSortAnother().quickSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test23);
        System.out.println();
        System.out.println();
        int[] test24 = new QuickSortAnotherLR2().quickSort(niemalejacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test24);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test25 = new InsertionSort().wstawianieSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test25);
        System.out.println();
        System.out.println();
        int[] test26 = new SelectionSort().wybieranieSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test26);
        System.out.println();
        System.out.println();
        int[] test27 = new BubbleSort().bubbleSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test27);
        System.out.println();
        System.out.println();
        int[] test28 = new MergeSort().mergeSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test28);
        System.out.println();
        System.out.println();
        int[] test29 = new QuickSortAnother().quickSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test29);
        System.out.println();
        System.out.println();
        int[] test30 = new QuickSortAnotherLR2().quickSort(losowy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test30);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test31 = new InsertionSort().wstawianieSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test31);
        System.out.println();
        System.out.println();
        int[] test32 = new SelectionSort().wybieranieSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test32);
        System.out.println();
        System.out.println();
        int[] test33 = new BubbleSort().bubbleSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test33);
        System.out.println();
        System.out.println();
        int[] test34 = new MergeSort().mergeSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test34);
        System.out.println();
        System.out.println();
        int[] test35 = new QuickSortAnother().quickSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test35);
        System.out.println();
        System.out.println();
        int[] test36 = new QuickSortAnotherLR2().quickSort(nierosnacy1000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test36);
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
        int[] test37 = new InsertionSort().wstawianieSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test37);
        System.out.println();
        System.out.println();
        int[] test38 = new SelectionSort().wybieranieSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test38);
        System.out.println();
        System.out.println();
        int[] test39 = new BubbleSort().bubbleSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test39);
        System.out.println();
        System.out.println();
        int[] test40 = new MergeSort().mergeSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test40);
        System.out.println();
        System.out.println();
        int[] test41 = new QuickSortaL().quickSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test41);
        System.out.println();
        System.out.println();
        int[] test42 = new QuickSortAnotherLR2().quickSort(niemalejacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test42);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  LOSOWY +++++++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test43 = new InsertionSort().wstawianieSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test43);
        System.out.println();
        System.out.println();
        int[] test44 = new SelectionSort().wybieranieSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test44);
        System.out.println();
        System.out.println();
        int[] test45 = new BubbleSort().bubbleSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test45);
        System.out.println();
        System.out.println();
        int[] test46 = new MergeSort().mergeSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test46);
        System.out.println();
        System.out.println();
        int[] test47 = new QuickSortAnother().quickSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test47);
        System.out.println();
        System.out.println();
        int[] test48 = new QuickSortAnotherLR2().quickSort(losowy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test48);
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++  NIEROSNĄCY ++++++++++++++++++++++++++++++++++:");
        System.out.println();
        int[] test49 = new InsertionSort().wstawianieSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test49);
        System.out.println();
        System.out.println();
        int[] test50 = new SelectionSort().wybieranieSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test50);
        System.out.println();
        System.out.println();
        int[] test51 = new BubbleSort().bubbleSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test51);
        System.out.println();
        System.out.println();
        int[] test52 = new MergeSort().mergeSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test52);
        System.out.println();
        System.out.println();
        int[] test53 = new QuickSortAnother().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test53);
        // new QuickSortaL().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        System.out.println();
        System.out.println();
        int[] test54 = new QuickSortAnotherLR2().quickSort(nierosnacy100000.clone(), stopWatch, printer);
        arrayGenerator.sprawdzCzyPosortowany(test54);
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
        /*int[] test12 = {6, 4, 1, 9, 5, 3};
        arrayGenerator.sprawdzCzyPosortowany(test12);
        int[] test23 = {0, 1, 2, 3, 4, 5};
        arrayGenerator.sprawdzCzyPosortowany(test23);*/
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
