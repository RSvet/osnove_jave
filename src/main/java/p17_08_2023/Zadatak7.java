package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj telefona: ");
        String telefon = s.next();

        if(!telefon.contains("+381") || telefon.contains("/")){
            System.out.println("Broj nije validan!");
        }


    }
}
