package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();

        for (int i = 0; i < brojUnosa; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i)+", ");
        }

    }
}
