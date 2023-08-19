package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        /*6.	(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        Primer izvrsenja:
        Unesite dimenziju table: 5
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
        */


        Scanner s = new Scanner(System.in);
        System.out.print("Unesite dimenziju table: ");
        int dimensions = s.nextInt();

        for(int i = 1; i<= dimensions; i++){
            for(int j = 1; j<= dimensions; j++){
                if(j==dimensions){
                    System.out.println("_|");
                }
                else{
                    System.out.print("_|");
                }

            }
        }
    }
}
