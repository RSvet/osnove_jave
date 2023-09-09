package d08_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
            /*
    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
     */
        Proizvod prviProizvod = new Proizvod();
        prviProizvod.naziv = "olovka";
        prviProizvod.tezina = 2;
        prviProizvod.cena = 100;

        Proizvod drugiProizvod = new Proizvod();
        drugiProizvod.naziv = "telefon";
        drugiProizvod.tezina = 189;
        drugiProizvod.cena = 50000;

        prviProizvod.stampaj();
        prviProizvod.povecajCenu(10.5);
        prviProizvod.stampaj();
        prviProizvod.vratiCenuSaPopustom(10);
        prviProizvod.stampaj();
        System.out.println("Postarina za "+prviProizvod.naziv+" je "+prviProizvod.racunajPostarinu()+" din.");

        System.out.println();

        drugiProizvod.stampaj();
        drugiProizvod.povecajCenu(5599.99);
        drugiProizvod.stampaj();
        drugiProizvod.vratiCenuSaPopustom(15);
        drugiProizvod.stampaj();
        System.out.println("Postarina za "+drugiProizvod.naziv+" je "+drugiProizvod.racunajPostarinu()+" din.");



    }

}
