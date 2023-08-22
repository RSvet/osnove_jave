package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        3.	Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
        ●	ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
        ●	ako se ne sadrzi, program dostampa na kraju
        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
        Primer izvrsenja:
        Unesite N: 5
        Unesite tekst: Cao!
                Cao!
                Unesite tekst: Hello
                Hello!
                Unesite tekst: Hi!
                Hi!
                Unesite tekst: Cuti
                Cuti!
                Unesite tekst: Ajde!
                Ajde!
                Nivo agresivnosti 60.
        (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)
        */

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int brojUnosa = s.nextInt();
        int brojac=0;

        for(int i = 0; i<brojUnosa; i++){
            System.out.print("Unesite rec: ");
            String unetaRec = s.next();
            if(unetaRec.contains("!")){
                System.out.println(unetaRec);
                brojac++;
            }
            else {
                System.out.println(unetaRec+"!");
            }
        }

        int nivoAgresivnosti = brojac*100/brojUnosa;
        System.out.print("Nivo agresivnosti: "+nivoAgresivnosti+"%");
    }
}
