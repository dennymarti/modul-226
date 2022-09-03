package ch.dennymarti.m226;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Reihenfolge {

    private int[] zahlen;
    private int range;

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Reihenfolge reihenfolge = new Reihenfolge();
        reihenfolge.read();
        reihenfolge.generiereZahlen();

        System.out.print("Unsortierte Zahlen: ");
        reihenfolge.printZahlen();
        System.out.println();

        System.out.print("Sortierte Zahlen: ");
        reihenfolge.sortiereZahlen();
        reihenfolge.printZahlen();
    }

    public void read() {
        System.out.print("Geben Sie eine Reichweite ein: ");
        try {
            range = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Eingabe konnte nicht gelesen werden:(");
            return;
        }
        zahlen = new int[range];
    }

    public void generiereZahlen() {
        Random random = new Random();

        for (int zahl = 0; zahl < zahlen.length; zahl++) {
            zahlen[zahl] = random.nextInt(range);
        }
    }

    public void sortiereZahlen() {
        // Arrays.sort(zahlen);
        int temporary;

        for (int i = 0; i < zahlen.length; i++) {
            for (int zahl = i; zahl > 0; zahl--) {
                if (zahlen[zahl] < zahlen[zahl - 1]) {
                    temporary = zahlen[zahl];
                    zahlen[zahl] = zahlen[zahl - 1];
                    zahlen[zahl - 1] = temporary;
                }
            }
        }
    }

    public void printZahlen() {
        for (int zahl = 0; zahl < zahlen.length; zahl++) {
            System.out.print(zahlen[zahl] + " ");
        }
    }
}
