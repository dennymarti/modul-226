package ch.dennymarti.m226;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dreieck {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck();
        dreieck.read();
    }

    public void read() {
        System.out.print("Geben Sie die Grösse an: ");
        try {
            printDreieck(scanner.nextInt());
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Eingabe konnte nicht gelesen werden:(");
        }
    }

    private void printDreieck(int rows) {
        for (int row = 0; row < rows; row++) {
            for (int star = 0; star < row + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
