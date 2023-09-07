package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Racun prviRacun = new Racun();
        prviRacun.broj = "123-455556-789";
        prviRacun.vlasnik = "Petar Petrovic";
        prviRacun.stanje = 1000;

        Racun drugiRacun = new Racun();
        drugiRacun.broj = "741-855552-963";
        drugiRacun.vlasnik = "Marko Milanovic";
        drugiRacun.stanje = 2000;

        System.out.println(prviRacun.vlasnik+", broj racuna: "+prviRacun.broj+", stanje: "+prviRacun.stanje+" din");
        System.out.println(drugiRacun.vlasnik+", broj racuna: "+drugiRacun.broj+", stanje: "+drugiRacun.stanje+" din");


        Scanner s = new Scanner(System.in);
        System.out.println("Posaljilac: "+prviRacun.vlasnik+", "+prviRacun.broj+", "+prviRacun.stanje);
        System.out.println("Primalac: "+drugiRacun.vlasnik+", "+drugiRacun.broj+", "+drugiRacun.stanje);

        System.out.print("Unesite sumu za transakciju: ");
        double suma = s.nextDouble();
        prviRacun.stanje -= suma;
        drugiRacun.stanje +=suma;
        System.out.println("Stanje nakon stransakcije:");
        System.out.println("Posaljilac: "+prviRacun.vlasnik+", "+prviRacun.broj+", "+prviRacun.stanje);
        System.out.println("Primalac: "+drugiRacun.vlasnik+", "+drugiRacun.broj+", "+drugiRacun.stanje);

    }
}
