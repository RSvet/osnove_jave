package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jacinu zvuka: ");
        int jacinaZvuka = s.nextInt();

        String zvuk = "<";

        if(jacinaZvuka==0){
            zvuk+="/";
        }
        else{
        for(int i=1; i<=jacinaZvuka; i++){
          zvuk+="|";
        }
        }

        System.out.print(zvuk);
    }

}

