package p14_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        Sastojak sastojak1 = new Sastojak("secer", 150);
        Sastojak sastojak2 = new Sastojak("so", 120);
        Sastojak sastojak3 = new Sastojak("biber", 200);

        Pasta pasta = new Pasta();
        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);

        pasta.stampa();

        pasta.obrisiSastojak("secer");
        System.out.println();
        pasta.stampa();

    }
}
