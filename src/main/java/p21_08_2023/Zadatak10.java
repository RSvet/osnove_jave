package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite password: ");
        String password = s.next();
        int duzinaSifre = password.length();
        for(int i = 0; i<duzinaSifre; i++){
            System.out.print("*");
        }
    }
}
