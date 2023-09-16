package d15_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Igrac prviIgrac = new Igrac("Sima Simic", "123456789124", 1987, 20, "napad", true);
        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");
        prviIgrac.dodajKarton(zuti);
        prviIgrac.dodajKarton(zuti);
        prviIgrac.dodajKarton(zuti);
        prviIgrac.dodajKarton(zuti);
        prviIgrac.dodajKarton(zuti);
        prviIgrac.stampaj();

        System.out.println();

        Igrac drugiIgrac = new Igrac("Petar Petrovic", "741852963", 1992, 3, "odbrana", false);
        drugiIgrac.dodajKarton(crveni);

        drugiIgrac.stampaj();
    }


}
