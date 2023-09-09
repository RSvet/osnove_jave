package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {


        Auto prviAuto = new Auto();
        prviAuto.vozac = "Marko Petrovic";
        prviAuto.marka = "Skoda";
        prviAuto.brojVrata = 4;
        prviAuto.potrosnja = 3.6;
        prviAuto.godinaProizvodnje = 2000;
        prviAuto.mesecIstekaRegistracije = 10;
        prviAuto.kubikaza = 2000;
        prviAuto.brzina = 150;
        prviAuto.maxBrzina = 200;


        prviAuto.stampa();

        if(prviAuto.prekoracenje(100)){
            System.out.println("Prekoracio je brzinu");
            System.out.println("Kazna je "+prviAuto.kazna(100)+" din");
        }
        else System.out.println("Nema prekoracenja");



        if(prviAuto.oldtajmer()){
            System.out.println("Automobil je oldtajmer");
        }
        else System.out.println("Automobil nije oldtajmer");

        if(prviAuto.isteklaRegistracija(12)){
            System.out.println("Cena registracije auta je: "+prviAuto.cenaRegistracije());
        }
        else System.out.println("Nije istekla registracija");


        prviAuto.dodajGas();
        prviAuto.dodajGas();
        prviAuto.dodajGas();
        prviAuto.dodajGas();
        prviAuto.dodajGas();
        prviAuto.dodajGas();

        prviAuto.koci();

        System.out.println("Trenutna potrosnja je: "+prviAuto.izracunajPotrosnju());

        prviAuto.stampajTablu();


    }
}
