package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();
        int brojac=0;

        for(int i = 0; i<brojUnosa; i++){
            System.out.print("Unesite broj: ");
            int unos = s.nextInt();
            if(unos%2==0){
                brojac++;
            }
        }
        System.out.print(brojac);
    }
}
