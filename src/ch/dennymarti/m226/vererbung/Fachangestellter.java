package ch.dennymarti.m226.vererbung;

public class Fachangestellter extends Person {

    private Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }

    public Chef getVorgesetzter() {
        return vorgesetzter;
    }

    public void setVorgesetzter(Chef vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }

    public void print() {
        System.out.println(this + ", Vorausgesetzter: " + vorgesetzter.toString());
    }

    @Override
    public int berechneFerien(int alter) {
        int wochen = 4;
        if (alter >= 50) {
            wochen++;
        }
        if (alter >= 60) {
            wochen++;
        }
        return wochen;
    }
}
