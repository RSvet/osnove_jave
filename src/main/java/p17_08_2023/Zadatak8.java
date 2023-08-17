package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite stranicu a trougla: ");
        int a = s.nextInt();

        System.out.println("Unesite stranicu b trougla: ");
        int b = s.nextInt();

        System.out.println("Unesite stranicu c trougla: ");
        int c = s.nextInt();

        if(a*a + b*b == c*c){
            System.out.println("Trougao je pravougli.");
        }
        else{
            System.out.println("Trougao nije pravougli.");
        }
    }
}
