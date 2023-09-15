package d14_09_2023.zadatak2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2 {
    public static void main(String[] args) {
        Kombinacija dobitna = new Kombinacija("a-852", 1,3,5,14,15,21,23);
        Kombinacija dobitna2 = new Kombinacija("a-852", 1,3,5,14,15,20,23);
        Kombinacija dobitna3 = new Kombinacija("a-852", 2,8,13,22,33,34,38);

        Kombinacija prvaKombinacija = new Kombinacija("a-123", 1,3,5,14,15,21,23);
        Kombinacija drugaKombinacija = new Kombinacija("a-456", 1,2,5,12,24,33,39);
        Kombinacija trecaKombinacija = new Kombinacija("a-789", 2,8,13,22,33,34,38);

        Listic listic = new Listic();
        listic.dodajKombinaciju(prvaKombinacija);
        listic.dodajKombinaciju(drugaKombinacija);
        listic.dodajKombinaciju(trecaKombinacija);



        System.out.println(listic.dobitna(dobitna));
        System.out.println(listic.dobitna(dobitna2));
        System.out.println(listic.dobitna(dobitna3));



        System.out.println();
        listic.stampa();


    }

}
