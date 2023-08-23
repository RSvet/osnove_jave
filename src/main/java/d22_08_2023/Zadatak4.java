package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*4.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
            Primer izvrsenja 1:
            Unesite broj:1
            Unesite broj:2
            Unesite broj:0
            Unesite broj:2
            Kraj programa.
            (Objasnjenje: Kraj jer je uneto dve dvojke)

            Primer izvrsenja 1:
            Unesite broj:1
            Unesite broj:2
            Unesite broj:1
            Unesite broj:3
            Unesite broj:1
            Kraj programa.
            (Objasnjenje: Kraj jer je uneto tri jedinice)
            */
        Scanner s = new Scanner(System.in);
        int counterForOne = 0;
        int counterForTwo = 0;
        boolean execute = true;


        while(execute){
            System.out.print("Unesite broj: ");
            int userInput = s.nextInt();

            if(userInput == 1){
                counterForOne++;
            }
            else if (userInput == 2){
                counterForTwo++;
            }

            if(counterForOne == 3 || counterForTwo == 2){
                execute = false;
            }
        }
        System.out.println("Kraj programa.");
    }
}
