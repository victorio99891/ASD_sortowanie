package pl.wiktor.printer;

public class Printer {

    public void drukujListe(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("]\n");
    }


}
