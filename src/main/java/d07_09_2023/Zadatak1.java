package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Zadatak 1: Kreiranje klase "Student"
        Napišite klasu "Student" koja ima sledeće atribute:
        ime (String), brojIndeksa (int) i fakultet (String).
        Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
        Ispisati informacije o studentima.
         */

        Student a = new Student();
        a.ime = "Maja Petrovic";
        a.brojIndeksa = 1023;
        a.fakultet = "Ekonomski fakultet";

        Student b = new Student();
        b.ime = "Tijana Simic";
        b.brojIndeksa = 5603;
        b.fakultet = "Gradjevinski fakultet";

        Student c = new Student();
        c.ime = "Ana Tepic";
        c.brojIndeksa = 8523;
        c.fakultet = "Fakultet tehnickih nauka";


        System.out.println("* Student "+a.ime+", sa brojem indeksa "+ a.brojIndeksa+", pohadja "+a.fakultet);
        System.out.println("* Student "+b.ime+", sa brojem indeksa "+ b.brojIndeksa+", pohadja "+b.fakultet);
        System.out.println("* Student "+c.ime+", sa brojem indeksa "+ c.brojIndeksa+", pohadja "+c.fakultet);

    }
}
