package ch.dennymarti.m226.vererbung;

public class Lernender extends Person {
    private int lehrjahr;

    public Lernender(String name, String vorname, int personalNummer, int lehrjahr) {
        super(name, vorname, personalNummer);
        this.lehrjahr = lehrjahr;
    }

    public int getLehrjahr() {
        return lehrjahr;
    }

    public void setLehrjahr(int lehrjahr) {
        this.lehrjahr = lehrjahr;
    }

    public void print() {
        System.out.println(this + ", Lehrjahr: " + lehrjahr);
    }

    @Override
    public int berechneFerien(int alter) {
        return 5;
    }
}
