package d12_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        FizickoLice prvaOsoba = new FizickoLice("Tanja Petrovic", "001145225","0506988705040", false);
        FizickoLice drugaOsoba = new FizickoLice("Marija Tepic", "004455889", "0409989406090", false);

        Ugovor kupoprodajniUgovor = new Ugovor("05.10.2022.", drugaOsoba, prvaOsoba, 85000, "Kralja Petra I 5, Novi Sad");
        kupoprodajniUgovor.stampaj();
    }
}
