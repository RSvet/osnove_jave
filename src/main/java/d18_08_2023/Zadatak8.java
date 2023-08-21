package d18_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        /*CIA je uspela da desifruje poruke hakerkse organizacije koju prati.
        Hakerska organizacija kriptuje poruke u int tako sto svaka poruka ima 10cifara(5 karaktera). Konvencijom je ustaljeno da se slova kriptuju u dvocifrene brojeve:
        A se kriptuje u 11
        B se kriptuje u 12
        …
        Z se kriptuje u 36
        Bilo koji drugi dvocifren broj se kriptuje u razmak.
        Napisati program koji dekeiptuje poruke hakerske organizacije.
        Npomena: program moze da dekriptuje odjednom samo rec od 4 slova.
        Primer izvrsenja 1:
        Poruka: 1815222225
        Dekriptovana poruka: HELLO

        Poruka koja presretnuta je
        25261528 11131920 11882015 76318830 25213198
        Koristeci program dekriptovati presretnutu poruku*/

        Scanner s = new Scanner(System.in);
        String rec;
        String recenica="";

        for(int pitanje=0; pitanje<5; pitanje++){
            rec="";
            System.out.print("Unesite "+(pitanje+1) +". sifrovanu poruku: ");
            int cryptedMessage = s.nextInt();
            for(int i =0; i<4; i++){
                int k = 11;
                for(char slovo = 'A'; slovo<='Z'; slovo++){
                    if(cryptedMessage%100 == k){
                        rec = slovo + rec;
                    }
                    else if (cryptedMessage%100 < 11 || cryptedMessage%100 > 36){
                        rec = " "+rec;
                        break;
                    }
                    k++;
                }
                cryptedMessage=cryptedMessage/100;
            }
           recenica+=rec;
        }
        System.out.print("Desifrovana poruka glasi: "+recenica);
    }
}
