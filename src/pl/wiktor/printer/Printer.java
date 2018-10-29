package pl.wiktor.printer;

public class Printer {

    public void drukujListe(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("]\n");
    }

    public void drukujSprawdzenie(int[] list) {
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("]\n");
    }

    public void drukujMaly(int[] list, int ileElementow) {
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("] n = " + ileElementow + " \n");
    }

    public void drukuj10(int[] list, int ileElementow) {
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print("... ] n = " + ileElementow + " \n");
    }


}
