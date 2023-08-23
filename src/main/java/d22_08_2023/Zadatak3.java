package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
     /*   3.	Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
      sve dok korisnik ne unese KRAJ..

      Primer izvrsenja:
        Unesite rimski broj: X
        Arapski: 10
        Unesite rimski broj: C
        Arapski: 100
        Unesite rimski broj: D
        Arapski: 500
        Unesite rimski broj: M
        Arapski: 1000
        Unesite rimski broj: I
        Arapski: 1
        Unesite rimski broj: KRAJ
        Kraj programa.
      */

        Scanner s = new Scanner(System.in);
        boolean endExecution = false;

        while(!endExecution){
            String message = "Arapski: ";
            System.out.print("Unesite rimski broj: ");
            String userInput = s.next().toUpperCase();

            if(userInput.equals("KRAJ")){
                endExecution = true;
                message = "Kraj programa.";
            }
            else if(userInput.equals("X")){
                message += 10;
            }
            else if (userInput.equals("C")){
                message += 100;
            }
            else if (userInput.equals("D")){
                message += 500;
            }
            else if (userInput.equals("M")){
                message += 1000;
            }
            else if (userInput.equals("I")){
                message += 1;
            }
            System.out.println(message);

        }


    }
}
