package d18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
       /* Napisati program koji iscrtava iks oks tablu. Stanje na tabli se cuva u intigeru koji uvek ima 9 cifara.
        Broj 1 u stanju je X, broj 2 je O, a 3 je prazno polje
        Primer izvrsenja:
        Unesite stanje table: 321211323
          | O | X
        O | X | X
          | O |

        */

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj od 9 cifara za stanje X-O table: ");
        int number = s.nextInt();
        int divisor= 100000000;

        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                    if(number/divisor%10 == 1){
                        if(j!=3){
                            System.out.print(" X |");
                        }
                        else {
                            System.out.println(" X ");
                        }
                    }
                    else if(number/divisor%10 == 2){
                        if(j!=3){
                            System.out.print(" O |");
                        }
                        else{
                            System.out.println(" O ");
                        }
                    }
                    else if(number/divisor%10 == 3){
                        if(j!=3){
                            System.out.print("   |");
                        }
                        else{
                            System.out.println("   ");
                        }
                    }
                divisor = divisor/10;
            }
        }

    }

}
