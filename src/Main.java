import org.apache.commons.lang3.time.StopWatch;
import pl.wiktor.alghoritms.BubbleSort;
import pl.wiktor.alghoritms.InsertionSort;
import pl.wiktor.alghoritms.MergeSort;
import pl.wiktor.alghoritms.SelectionSort;
import pl.wiktor.generator.ArrayGenerator;
import pl.wiktor.printer.Printer;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    public static Random random = new Random();
    public static StopWatch stopWatch = new StopWatch();
    public static Printer printer = new Printer();
    public static DecimalFormat format = new DecimalFormat("#.#################");
    public static ArrayGenerator arrayGenerator = new ArrayGenerator();

    public static void main(String[] args) {

        int[] wygenerowany = arrayGenerator.generujCiag(random, 100);


        int[] test11 = {90, 63, 42, 93, 96, 41};
        int[] test2 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] test23 = {6, 5, 10, 3, 1, 8, 7, 2, 4, 9};
        int[] test55 = {6, 4, 1, 9, 5, 3};
        int[] test99 = {3, 4, 1, 2, 0};
        int[] test = wygenerowany.clone();

        System.out.println("Wygenerowany: ");
        printer.drukujListe(wygenerowany);
        System.out.println();

        System.out.println("Z prezentacji: ");
        printer.drukujListe(test);
        System.out.println();


        //WBIERANIE
        new SelectionSort().wybieranieSort(test.clone(), stopWatch, printer);
        System.out.println();
        //WSTAWIANIE
        new InsertionSort().wstawianieSort(test.clone(), stopWatch, printer);
        System.out.println();
        //BUBBLE
        new BubbleSort().bubbleSort(test.clone(), stopWatch, printer);
        System.out.println();
        //SCALANIE
        new MergeSort().mergeSort(test.clone(), stopWatch, printer);

    }

}
