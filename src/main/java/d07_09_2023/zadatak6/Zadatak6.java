package d07_09_2023.zadatak6;

import d07_09_2023.zadatak6.Dostava;
import d07_09_2023.zadatak6.Ruta;
import d07_09_2023.zadatak6.Vozac;
import d07_09_2023.zadatak6.Vozilo;

public class Zadatak6 {
    public static void main(String[] args) {
        /*
        Upravljanje Flotom Vozila - Rešite Poslovni Problem
        Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem.
        Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
        Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
        Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave.
        Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.

        **Scenario:**
        Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model,
        registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije,
        uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
        Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima)
        i očekivano vreme putovanja.
        Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da
        optimizuje svoje poslovanje.
        Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima,
        vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima
        i u glavnom programu kreirajte objekte.
         */

        // prvi vozac
        Vozac driverA = new Vozac();
        driverA.ime = "Dragan";
        driverA.prezime = "Petrovic";
        driverA.JMBG = "1234567891478";
        driverA.brojVozacke = 123;
        driverA.datumIstekaVozacke = "15.07.2025.";
        // drugi vozac
        Vozac driverB = new Vozac();
        driverB.ime = "Petar";
        driverB.prezime = "Markovic";
        driverB.JMBG = "9994567891478";
        driverB.brojVozacke = 589;
        driverB.datumIstekaVozacke = "05.05.2030.";

        // prvo vozilo
        Vozilo vehicleA = new Vozilo();
        vehicleA.marka = "Skoda";
        vehicleA.model = "Fabia";
        vehicleA.godinaProizvodnje = 2010;
        vehicleA.registarskiBroj = "NS-123-456";
        // drugo vozilo
        Vozilo vehicleB = new Vozilo();
        vehicleB.marka = "Fiat";
        vehicleB.model = "Punto";
        vehicleB.godinaProizvodnje = 2005;
        vehicleB.registarskiBroj = "NS-852-498";

        // prva ruta
        Ruta routeA = new Ruta();
        routeA.polaznaTacka = "Kralja Petra I 15, Novi Sad";
        routeA.odrediste = "Sutjeska 3, Beograd";
        routeA.duzinaKm = 80;
        routeA.brojDana = 2;
        //druga ruta
        Ruta routeB = new Ruta();
        routeB.polaznaTacka = "Bulevar Oslobodjenja 33, Novi Sad";
        routeB.odrediste = "Mihajla Pupina 5, Subotica";
        routeB.duzinaKm = 100;
        routeB.brojDana = 3;

        // prva dostava
        Dostava deliveryA = new Dostava();
        deliveryA.driver = driverB;
        deliveryA.route = routeA;
        deliveryA.vehicle = vehicleA;
        deliveryA.status = "u toku";
        deliveryA.deliveryNumber=111;
        //druga dostava
        Dostava deliveryB = new Dostava();
        deliveryB.driver = driverB;
        deliveryB.route = routeB;
        deliveryB.vehicle = vehicleB;
        deliveryB.status = "dostavljeno";
        deliveryB.deliveryNumber = 333;
        //treca dostava
        Dostava deliveryC = new Dostava();
        deliveryC.driver = driverA;
        deliveryC.route = routeA;
        deliveryC.vehicle = vehicleB;
        deliveryC.status = "u toku";
        deliveryC.deliveryNumber = 999;

        System.out.println("********************");
        System.out.println("Podaci o dostavama:");
        System.out.println("********************");
        System.out.println();

        System.out.print("* ");deliveryA.ispis();
        System.out.println();

        System.out.print("* ");deliveryB.ispis();
        System.out.println();

        System.out.print("* ");deliveryC.ispis();
    }
}
