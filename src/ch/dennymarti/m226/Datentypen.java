package ch.dennymarti.m226;

public class Datentypen {

    private int lernende;
    private boolean zustand;
    private float betrag;
    private String klasse;
    private char linie;

    public static void main(String[] args) {
        Datentypen datentypen = new Datentypen(20, true, 29.9F, "INF2020g", 'b');

        System.out.println("Anzahl Lernende: " + datentypen.getLernende());
        System.out.println("PC-Zustand: " + datentypen.getZustand());
        System.out.println("Konto Betrag: " + datentypen.getBetrag());
        System.out.println("Schulklasse: " + datentypen.getKlasse());
        System.out.println("Strichlinie: " + datentypen.getLinie());
    }

    public Datentypen(int lernende, boolean zustand, float betrag, String klasse, char linie) {
        this.lernende = lernende;
        this.zustand = zustand;
        this.betrag = betrag;
        this.klasse = klasse;
        this.linie = linie;
    }

    public int getLernende() {
        return lernende;
    }

    public boolean getZustand() {
        return zustand;
    }

    public float getBetrag() {
        return betrag;
    }

    public String getKlasse() {
        return klasse;
    }

    public char getLinie() {
        return linie;
    }
}
