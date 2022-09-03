package ch.dennymarti.m226.vererbung;

public class Personen {

    public static void main(String[] args) {
        Person[] angestellte = new Person[3];
        angestellte[0] = new Chef("Sattler", "Beatrice", 25, "Verkauf");
        angestellte[1] = new Lernender("Marti", "Denny", 26, 2);
        angestellte[2] = new Fachangestellter("Maurer", "Ralph", 27, (Chef) angestellte[0]);

        for (int i = 0; i < angestellte.length; i++) {
            angestellte[i].print();
        }

        System.out.println("Der Ferienanspruch beträgt: " + angestellte[0].berechneFerien(56));
        System.out.println("Der Ferienanspruch beträgt: " + angestellte[1].berechneFerien(15));
        System.out.println("Der Ferienanspruch beträgt: " + angestellte[2].berechneFerien(58));
    }
}
