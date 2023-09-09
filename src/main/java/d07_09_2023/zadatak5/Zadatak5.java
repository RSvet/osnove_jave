package d07_09_2023.zadatak5;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
            Kreiranje klase "Oprema"
            Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
            U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
            Ispisati informacije o opremi.
         */

        Scanner s = new Scanner(System.in);

        Oprema firstEq = new Oprema();
        Oprema secondEq = new Oprema();
        Oprema thirdEq = new Oprema();

        System.out.print("Unesite tip za 1. opremu: ");
        firstEq.tip = s.next();

        System.out.print("Unesite marku za 1. opremu: ");
        firstEq.marka = s.next();

        System.out.print("Unesite cenu za 1. opremu: ");
        firstEq.cena =  s.nextDouble();

        System.out.println();
        System.out.print("Unesite tip za 2. opremu: ");
        secondEq.tip = s.next();

        System.out.print("Unesite marku za 2. opremu: ");
        secondEq.marka = s.next();

        System.out.print("Unesite cenu za 2. opremu: ");
        secondEq.cena =  s.nextDouble();

        System.out.println();
        System.out.print("Unesite tip za 3. opremu: ");
        thirdEq.tip = s.next();

        System.out.print("Unesite marku za 3. opremu: ");
        thirdEq.marka = s.next();

        System.out.print("Unesite cenu za 3. opremu: ");
        thirdEq.cena =  s.nextDouble();

        System.out.println();

        System.out.println("Oprema "+firstEq.tip+", marka "+firstEq.marka+", cena "+firstEq.cena+" din");
        System.out.println("Oprema "+secondEq.tip+", marka "+secondEq.marka+", cena "+secondEq.cena+" din");
        System.out.println("Oprema "+thirdEq.tip+", marka "+thirdEq.marka+", cena "+thirdEq.cena+" din");






    }
}
