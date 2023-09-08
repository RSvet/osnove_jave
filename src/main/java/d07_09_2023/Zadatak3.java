package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        Kreiranje klase "Proizvod"
        Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
        U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.
         */

        Proizvod firstProduct = new Proizvod();
        Proizvod secondProduct = new Proizvod();
        Proizvod thirdProduct = new Proizvod();

        firstProduct.naziv = "Frizider";
        firstProduct.cena = 80000.99;

        secondProduct.naziv = "Stona lampa";
        secondProduct.cena = 5999.99;

        thirdProduct.naziv = "Laptop";
        thirdProduct.cena = 84300.79;

        System.out.println("Proizvod - "+firstProduct.naziv+" kosta "+firstProduct.cena+" din");
        System.out.println("Proizvod - "+secondProduct.naziv+" kosta "+secondProduct.cena+" din");
        System.out.println("Proizvod - "+thirdProduct.naziv+" kosta "+thirdProduct.cena+" din");

    }
}
