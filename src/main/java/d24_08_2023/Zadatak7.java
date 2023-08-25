package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        /*
        Zadatak 7
        (Za vezbanje) Napisati program koji ucitava niz a duzine N.
        Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)

        Unesite N: 6
        Unesite broj: 1
        Unesite broj: 5
        Unesite broj: 2
        Unesite broj: 7
        Unesite broj: 8
        Unesite broj: -1

        Niz a: 1, 5, 2, 7, 8, -1
        Niz b: 1, 5, 2, 1, 1, 1
      */
        String messageA = "Niz a: ";
        String messageB = "Niz b: ";

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int arrayCapacity = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < arrayCapacity; i++) {
            System.out.print("Unesite broj: ");
            int number = s.nextInt();
            a.add(number);
            messageA += a.get(i)+", ";
        }

        for (int i = 0; i < a.size(); i++) {
            if(i<3){
                b.add(a.get(i));
            }
            else b.add(1);

            messageB += b.get(i)+", ";
        }

        System.out.println(messageA);

        System.out.println(messageB);
    }
}
