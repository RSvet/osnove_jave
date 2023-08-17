package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj a: ");
        double a = s.nextDouble();

        System.out.println("Unesite drugi broj b: ");
        double b = s.nextDouble();

        System.out.println("Unesite treci broj c: ");
        double c = s.nextDouble();

        double prosek = (a+b+c)/3;

        System.out.println("Prosek brojeva "+a+", "+b+", "+c+" je "+prosek);
    }
}
