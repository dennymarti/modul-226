package ch.dennymarti.m226;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ggT {

    private int zahl1;
    private int zahl2;

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ggT ggt = new ggT();
        ggt.read();
    }

    public void read() {
        System.out.print("Geben Sie die erste Zahl ein: ");
        try {
            zahl1 = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Eingabe konnte nicht gelesen werden:(");
        }

        System.out.print("Geben Sie die zweite Zahl ein: ");
        try {
            zahl2 = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Eingabe konnte nicht gelesen werden:(");
        }
        System.out.print("Der ggT von " + zahl1 + " und " + zahl2 + " lautet: ");
        berechne(zahl1, zahl2);
    }

    private void berechne(int zahl1, int zahl2) {
        int temporary;
        int rest;

        if (zahl1 < zahl2) {
            temporary = zahl1;
            zahl1 = zahl2;
            zahl2 = temporary;
        }
        while (zahl2 != 0) {
            rest = zahl1 % zahl2;
            zahl1 = zahl2;
            zahl2 = rest;
        }
        System.out.print(zahl1);
    }
}
