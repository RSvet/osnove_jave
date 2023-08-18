package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        if(a%2==0 && a%3==0){
            System.out.println("Broj je deljiv sa 2 i 3");
        }
        else if(a%2 == 0 || a%3==0){
            System.out.println("Broj je deljiv sa 2 ili 3");
        }
        else {
            System.out.println("Broj nije deljiv sa 2 ni sa 3");
        }

    }
}
