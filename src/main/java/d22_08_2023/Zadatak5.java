package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /* 5.	Napisati program koji proverava uparenost zagrada.
        Korisnik unosi matematicku formulu sve dok ne unese znak =.
        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.

        Formula koja se koristi u primeru je: (2 * (1 + 3)) =

        Primer izvrsenja:
        Unos: (
        Unos: 2
        Unos: *
        Unos: (
        Unos: 1
        Unos: +
        Unos: 3
        Unos: )
        Unos: )
        Unos: =
        Zagrade su uparene
        (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)

        Primer izvrsenja 2:
        Unos: (
        Unos: 2
        Unos: *
        Unos: (
        Unos: 1
        Unos: +
        Unos: 3
        Unos: )

        Unos: =
        Zagrade nisu uparene
        (Objasnjenje: fali poslednja zagrada iz formule)
         */

        Scanner s = new Scanner(System.in);

        boolean execute = true;

        int openParenthesisCount = 0;
        int closedParenthesisCount = 0;

        String message = "";

        while(execute){
            System.out.print("Unos: ");
            String userInput = s.next();

            if(userInput.equals("(")){
                openParenthesisCount++;
            }
            else if (userInput.equals(")")){
                closedParenthesisCount++;
            }
            else if (userInput.equals("=")){
                execute = false;
            }
        }

        if(openParenthesisCount == 0 && closedParenthesisCount == 0){
            message="Nema zagrada u izrazu";
        }
        else if(openParenthesisCount == closedParenthesisCount){
         message = "Zagrade su uparene";
        }
        else message="Zagrade nisu uparene";

        System.out.print(message);

    }
}
