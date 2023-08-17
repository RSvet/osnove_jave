package p17_08_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite tezinu: ");
        double kg = s.nextDouble();

        System.out.println("Unesite da li ste aktivni: ");
        boolean aktivan = s.nextBoolean();

        System.out.println("IME "+ime);
        System.out.println("PREZIME "+prezime);
        System.out.println("TEZINA "+kg);
        System.out.println("Aktivnost "+aktivan);


//        System.out.println("Unesite broj a: ");
//        int a = s.nextInt();

//        System.out.println("Unesite broj b: ");
//        int b = s.nextInt();
//
//        System.out.println("Kraj");

//        int a = 10;
//        int b = 2;

//        int c = a + b;
//        int d = a - b;
//        int e = a * b;
//        int f = a/b;
//
//        System.out.println("Zbir je: "+c);
//        System.out.println("Razlika je: "+d);
//        System.out.println("Proizvod je: "+e);
//        System.out.println("Kolicnik je: "+f);
    }
}
