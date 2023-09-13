package d12_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        Racun platilac = new Racun("123-456-7895","Milan Markovic", 15500);
        Racun primalac = new Racun("741-852-9632", "Tijana Ristic", 74000);

        Transakcija prenos = new Transakcija(123, platilac, primalac);

        prenos.izvrsiTransakciju(399.99);
        prenos.stampaj();
        System.out.println();
        platilac.stampaj();
        System.out.println();
        primalac.stampaj();
        System.out.println();
        platilac.skiniSaRacuna(5500);
        System.out.println();
        platilac.stampaj();
    }
}
