package p17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite znak karte: ");
        String znak = s.next();

        System.out.println("Unesite broj karte: ");
        String broj = s.next();

        System.out.println("Znak karte koju zelite da odigrate: ");
        String znak2 = s.next();

        System.out.println("Broj karte koju zelite da odigrate: ");
        String broj2 = s.next();

        if(znak.equals(znak2) || broj.equals(broj2)){
            System.out.println("Potez je ispravan");
        }
        else {
            System.out.println("Potez nije ispravan");
        }
    }
}
