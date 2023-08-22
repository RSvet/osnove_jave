package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean endOne = false;
        boolean endTwo = false;
        boolean endThree = false;
        boolean endFour = false;
        int broj;


       while(!(endOne && endTwo && endThree && endFour)){

            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if(broj == 1){
                endOne = true;
            }
            else if (broj == 2){
                endTwo = true;
            }
            else if (broj == 3){
                endThree = true;
            }
            else if (broj == 4){
                endFour = true;
            }

        }
        System.out.println("kraj programa");


    }
}
