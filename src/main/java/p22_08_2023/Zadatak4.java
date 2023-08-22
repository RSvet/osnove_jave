package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean end = false;
        int jacinaZvuka = 75;
        String akcija = "";

        while(!end){
            System.out.println("Unesite akciju: ");
            akcija = s.next();

            if(akcija.contains("pojacaj")){

                if(jacinaZvuka<=90){
                    jacinaZvuka+=10;
                }
                else jacinaZvuka = 100;
            }
            else if (akcija.contains("smanji")){
                if(jacinaZvuka>=10){
                    jacinaZvuka-=10;
                }
               else jacinaZvuka=0;
            }
            else if(akcija.contains("play")){
                System.out.println("Jacina zvuka je "+jacinaZvuka);
                end = true;
            }
        }
    }
}
