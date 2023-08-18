package p18_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa(s): ");
        int duzinaSec = s.nextInt();

        System.out.println("Unesite trenutno vreme: ");
        int trenutnoVreme = s.nextInt();

        int procentatPregleda = trenutnoVreme*100/duzinaSec;

         for(int i=0; i<=duzinaSec; i++){
             if(i<=procentatPregleda){
                 System.out.print("*");
             }
             else {
                 System.out.print("_");
             }
         }
    }
}
