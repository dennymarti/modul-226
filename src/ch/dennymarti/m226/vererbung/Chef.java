package ch.dennymarti.m226.vererbung;

public class Chef extends Person {

    private String abteilung;

    public Chef(String name, String vorname, int personalNummer, String abteilung) {
        super(name, vorname, personalNummer);
        this.abteilung = abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public void print() {
        System.out.println(this + ", Abteilung: " + abteilung);
    }

    @Override
    public int berechneFerien(int alter) {
        int wochen = 4;
        if (alter >= 45) {
            wochen++;
        }
        if (alter >= 55) {
            wochen++;
        }
        return wochen;
    }
}
