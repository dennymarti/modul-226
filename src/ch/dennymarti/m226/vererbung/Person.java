package ch.dennymarti.m226.vererbung;

public abstract class Person {

    protected String name;
    protected String vorname;
    protected int personalNummer;

    public Person(String name, String vorname, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public String toString() {
        return "Name: " + name + ", Vorname: " + vorname + ", Personalnummer: " + personalNummer;
    }

    public abstract void print();

    public abstract int berechneFerien(int alter);
}
