package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
        (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
        odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        Primer 1:
        Unestite a: 6
        Unesite b: 3
        Unesite operator: +
        Rezultat: 9

        Primer 2:
        Unestite a: 6
        Unesite b: 3
        Unesite operator: /
        Rezultat: 2
         */
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Unesite operator: ");
        String operation = s.next();

        if(operation.equals("+")){
            System.out.print("Rezultat: "+(a+b));
        }
        else if (operation.equals("-")){
            System.out.println("Rezultat: "+(a-b));
        }
        else if (operation.equals("*")){
            System.out.println("Rezultat: "+(a*b));
        }
        else if (operation.equals("/")){
            System.out.println("Rezultat: "+(a/b));
        }
    }
}
