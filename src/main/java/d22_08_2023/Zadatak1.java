package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*1.	Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
        Na kraju programa ispisati sracunatu sumu.
        Unesite vrednost: 20
        Unesite vrednost: 50
        Unesite vrednost: 50
        Prekoracenje! Kraj programa. Sracunata suma je 70.
        */

        Scanner s = new Scanner(System.in);

        boolean endExecution = false;
        int sum = 0;

        while(!endExecution){
            System.out.print("Unesite vrednost: ");
            int enteredNumber = s.nextInt();

            if(sum+enteredNumber > 100){
                System.out.print("Prekoracenje! Kraj programa. Sracunata suma je: "+sum+".");
                endExecution = true;
            }
            else sum+=enteredNumber;
        }

    }
}
