package p12_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik  prviKorisnik = new ViberKorisnik("Petar Simic", "123-456",false);
        ViberKorisnik drugiKorisnik = new ViberKorisnik("Maja Kostic", "789-789", false);
        ViberReakcija reakcija = new ViberReakcija("smile", drugiKorisnik);
        ViberPoruka poruka = new ViberPoruka("Kako si?", "10.09.2023. 18:30", prviKorisnik, drugiKorisnik, reakcija);
        poruka.prikazi();
    }
}
