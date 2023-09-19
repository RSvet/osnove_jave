package p19_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

        PoreskaUprava uprava = new PoreskaUprava("Novi Sad");
        Objekat kuca = new Kuca("Bulevar oslobodjenja 33", 120, 1, 3);
        Objekat zgrada = new Zgrada("Kralja Petra I 26", 1000, 2, 20);
        Objekat lokal = new Lokal("Strazilovska 5", 200, 3);
        Objekat kuca2 = new Kuca("Uspenska 4", 80, 1, 4);
        Objekat lokal2 = new Lokal("Kosovska 4", 75, 3);

        uprava.dodajObjekat(kuca);
        uprava.dodajObjekat(kuca2);
        uprava.dodajObjekat(zgrada);
        uprava.dodajObjekat(lokal);
        uprava.dodajObjekat(lokal2);

        uprava.stampaj();

        System.out.println();

       System.out.println("Najmanji porez: "+uprava.najmanjiPorez().porez());
       System.out.println("Najveci porez: "+uprava.najveciPorez().porez());
        System.out.println("Ukupan porez: "+uprava.ukupanPorez());


    }
}
