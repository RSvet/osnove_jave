package p12_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        ClanskaKarta clanskaKarta = new ClanskaKarta(8, "123-4567");
        Kupac kupac = new Kupac("Marija Simic", clanskaKarta);
        Proizvod proizvod = new Proizvod("TV", kupac, 30000);
        proizvod.cenaProizvoda();
        proizvod.stampa();



    }
}
