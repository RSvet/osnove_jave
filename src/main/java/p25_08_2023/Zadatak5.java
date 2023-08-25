package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int M = s.nextInt();

        for (int i = 1; i <= M; i++) {
            printStar(i);
        }

    }

    public static void printStar(int numberOfStars){
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
