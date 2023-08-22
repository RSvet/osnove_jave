package p22_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        boolean end = false;
        while(!end){
            System.out.println("Unesite vrednost");
            int broj = s.nextInt();

            if(suma+broj> 100){
                System.out.println("Prekoracenje! Kraj programa. Suma je: "+suma);
                end = true;
            }
            else suma+=broj;
        }

    }
}
