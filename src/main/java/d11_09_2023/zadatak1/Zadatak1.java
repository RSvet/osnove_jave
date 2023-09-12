package d11_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {


        Autor prviAutor = new Autor("Ivo", "Andric");
        Autor drugiAutor = new Autor("Zil", "Vern");

        Knjiga prvaKnjiga = new Knjiga("123-456-789", "Na Drini cuprija", 1945, prviAutor);
        prvaKnjiga.print();

        System.out.println();

        Knjiga drugaKnjiga = new Knjiga();
        drugaKnjiga.setISBN("456-852-963");
        drugaKnjiga.setNaziv("Tajanstveno ostrvo");
        drugaKnjiga.setGodina(1875);
        drugaKnjiga.setAutor(drugiAutor);
        drugaKnjiga.print();

        System.out.println();

        Knjiga trecaKnjiga = new Knjiga("412-365-987", "Prokleta avlija", 1954, prviAutor);
        trecaKnjiga.print();

    }
}
