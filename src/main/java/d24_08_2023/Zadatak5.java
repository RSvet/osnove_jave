package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
        5.	 Napisati program koji ucitava niz A duzine N i broj X.
        Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.

        Primer izvrsenja:
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: 3
        Unesite broj: 7
        Unesite broj: 3
        Unesite broj: 9
        Unesite X: 3

        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3
        */

        ArrayList <Integer> A = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int arrayCapacity = s.nextInt();

        for (int i = 0; i < arrayCapacity; i++) {
            System.out.print("Unesite broj ");
            int number = s.nextInt();
            A.add(number);
        }
        System.out.print("Unesite X: ");
        int X = s.nextInt();

        String message = "Elementi niza A koji su jednaki broju X imaju indekse: ";

        for (int i = 0; i < A.size(); i++) {
           if(A.get(i)==X){
               message += i+", ";
           }
        }
        System.out.print(message);
    }
}
