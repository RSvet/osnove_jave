package p21_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();
        int poeni=0;
        for(int i = 0; i<brojUnosa; i++){
            poeni=0;
            System.out.println("Unesite password: ");
            String password = s.next();
            if(password.length()>8 ){
                poeni++;
            }
            if(password.contains("@")){
                poeni++;
            }
            System.out.println("Password ima: "+poeni+" poena.");
        }

    }
}
