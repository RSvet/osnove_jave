package p22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        System.out.print("Unesite broj: ");
//        int unos = s.nextInt();
//
//        while(unos<10 || unos>50){
//            System.out.println("greska");
//            System.out.print("Unesite broj: ");
//            unos = s.nextInt();
//        }
//
//        System.out.println("Kraj");

        int unos = 0;
 //       int end = 0;


//        while(end == 0){
//            System.out.print("Unesite broj: ");
//            unos = s.nextInt();
//            if(unos < 10 || unos >50){
//                System.out.println("Greska");
//            }
//
//            if(unos > 10 && unos < 50){
//                end = 1;
//            }
//        }

        boolean isValid = false;

        while(!isValid){
            System.out.print("Unesite broj: ");
            unos = s.nextInt();
            if(unos < 10 || unos >50){
                System.out.println("Greska");
            }
            if(unos > 10 && unos < 50){
               isValid = true;
            }
        }




    }
}
