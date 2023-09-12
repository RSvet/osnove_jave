package p12_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik host = new Korisnik("Jelena Maksimovic");
        Korisnik guest = new Korisnik("Marko Petrovic");
        host.preplatiSe(150);
        ZoomCall call = new ZoomCall("https://us02web.us/5646542164", "sifra123", host);
        call.setGuest(guest);
        call.pokreniPoziv();

    }
}
