package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        1.Zadatak
        Napisati program koji u sebi ima definisan niz od 10 brojeva (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K.
        K i novu vrednost unosi korisnik.
        Primer:
        Unesite pozicjiu od 0 do 9: 3
        Unesite novu vrednost: 11
        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
        */

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int positionK = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int newValue = s.nextInt();

        numbers.set(positionK, newValue);

    }
}
