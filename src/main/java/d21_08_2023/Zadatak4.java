package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
        4.	Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
            Program podrzava sledece reakcije:
            ●	like
            ●	smile
            ●	heart
            Primer izvrsenja:
            Unesite N: 7
                Reaguj: like
                Reaguj: heart
                Reaguj: smile
                Reaguj: lol
                Reaguj: smile
                Reaguj: like
                Reaguj: like
            Summary: like 3 | smile 2 | heart 1

            Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.

            POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

         */

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();

        int likeCount=0, heartCount=0, smileCount=0;

        for(int i=0; i<brojUnosa; i++){
            System.out.print("Reaguj: ");
            String reaction = s.next();

            if(reaction.equals("like")){
                likeCount++;
            }
            else if(reaction.equals("heart")){
                heartCount++;
            }
            else if(reaction.equals("smile")){
                smileCount++;
            }

        }
        System.out.print("Summary: like "+likeCount+" | smile "+smileCount+" | heart "+heartCount);

    }
}
