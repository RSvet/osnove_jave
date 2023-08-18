package d17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        /*
        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
        Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.

        Primer izvrsenja 1:
        Unesite a: 10  -> # 10
        Unesite b: -2   -> -2 # 10
        Unesite c: -1   -> -1 -2 # 10
        Unesite d: 9    -> -1 -2 # 10 9
        String p ime vrednost = -1 -2 # 10 9
        */
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

        System.out.println("Unesite d: ");
        int d = s.nextInt();

        String p = "#";

        if(a<0){
            p = a +" "+p;
        }
        if(a>=0){
            p+=" "+a;
        }
        if(b<0){
            p = b+" "+p;
        }
        if(b>=0){
            p+=" "+b ;
        }
        if(c<0){
            p = c + " " + p;
        }
        if(c>=0){
            p +=" "+ c;
        }
        if(d<0){
            p = d +" "+ p;
        }
        if(d>=0){
            p+=" "+d;
        }

        System.out.println(p);

    }

}
