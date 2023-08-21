package p21_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int unos = s.nextInt();
        int broj=0;
        for(int i=0; i<5; i++){
         broj = broj*10 + unos%10;
         unos/=10;
        }

        System.out.println(broj);
    }
}
