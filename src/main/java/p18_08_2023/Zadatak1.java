package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi broj N: ");
        int brojN = s.nextInt();

        System.out.print("Unesi operaciju: ");
        String operacija = s.next();

        if(operacija.equals("uvecaj")){
            brojN+=1;
        }
        if(operacija.equals("smanji")){
            brojN-=1;
        }
        System.out.print(brojN);
    }
}
