package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter=0;
        boolean end  = false;
        int broj = 0;


        while(!end){
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if(broj == 0){
                counter++;
            }
            if (counter == 2){
                System.out.println("Kraj programa");
                end = true;
            }
        }

    }
}
