package d11_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik korisnik = new Korisnik();
        korisnik.print();
        System.out.println();
        korisnik.setIme("Marija");
        korisnik.setPrezime("Popovic");
        FacebookPost post = new FacebookPost("Zdravo", korisnik);
        post.print();
    }
}
