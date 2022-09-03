package ch.dennymarti.m226;

import java.util.Random;

public class AufgabeXO {

    private char x = 'X';
    private char o = '0';

    public static void main(String[] args) {
        AufgabeXO aufgabeXO = new AufgabeXO();

        for (int row = 0; row <= 10; row++) {
            aufgabeXO.printXO(row, aufgabeXO.getRandomNumber());
        }
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    public void printXO(int row, int random) {
        String zeichenkette = "";
        int anzahlX = 0;
        int abstand = 10 / random;

        for (int i = 0; i < 10; i++) {

            if (i % abstand == 0 && anzahlX < random) {
                zeichenkette += x;
                anzahlX++;
            } else {
                zeichenkette += o;
            }
        }
        System.out.println("Zeile: " + row + " Zuffahlszahl: " + random + " |" + zeichenkette);
    }

}
