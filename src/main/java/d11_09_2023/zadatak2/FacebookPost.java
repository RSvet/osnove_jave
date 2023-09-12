package d11_09_2023.zadatak2;

public class FacebookPost {
    /*
    Kreirati klasu FacebookPost
    ●	opis
    ●	korisnik (referenca na korisnika koji je kreirao post)
    ●	konstruktore koje mislite da su vam potrebni
    ●	metoda print, stampa u formatu:
    (ime) (prezime)
    (opis post-a)
     */

    private String opis;
    private Korisnik korisnik;
    public FacebookPost(String opis, Korisnik korisnik){
        this.opis = opis;
        this.korisnik = korisnik;
    }


    public void print(){
       this.korisnik.print();
       System.out.println(this.opis);
    }
}
