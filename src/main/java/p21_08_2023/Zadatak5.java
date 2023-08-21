package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();
        int sumaBrojeva=0;
        for(int i =1; i<=brojUnosa; i++){
            System.out.print("Unesite broj: ");
            int unosBroja = s.nextInt();
            sumaBrojeva+=unosBroja;
        }
        System.out.println(sumaBrojeva);
    }
}
