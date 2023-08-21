package p21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int unos = s.nextInt();

        for(int i=0; i<5; i++){
            if(i==4){
                System.out.print(unos%10);
            }
            else
            { System.out.print(unos%10+", ");}
            unos/=10;
        }
    }
}
