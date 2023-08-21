package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();
        int rezultat=0;

        for(int i = 1; i<=brojUnosa; i++){
            System.out.print("Unesite broj: ");
            int unetBroj = s.nextInt();
            rezultat = rezultat*10 +unetBroj;
        }
        System.out.println(rezultat);

    }
}
