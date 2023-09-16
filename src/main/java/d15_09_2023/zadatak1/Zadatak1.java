package d15_09_2023.zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Igrac>igraci = new ArrayList<>();
        ArrayList<Trener>treneri = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime "+(i+1)+". igraca? ");
            String ime = s.next();
            System.out.print("Unesite prezime "+(i+1)+". igraca? ");
            String prezime = s.next();
            System.out.print("Unesite jmbg "+(i+1)+". igraca? ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja "+(i+1+". igraca? "));
            int godina = s.nextInt();
            System.out.print("Unesite broj na dresu "+(i+1)+". igraca? ");
            int broj = s.nextInt();
            System.out.print("Unesite poziciju "+(i+1)+". igraca? ");
            String pozicija = s.next();
            System.out.print("Da li je "+(i+1)+". igrac kapiten? ");
            boolean kapiten = s.nextBoolean();
            igraci.add(new Igrac(ime+" "+prezime, jmbg, godina, broj, pozicija, kapiten));
            System.out.println();
        }

        System.out.println();
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime "+(i+1)+". trenera? ");
            String ime = s.next();
            System.out.print("Unesite prezime "+(i+1)+". trenera? ");
            String prezime = s.next();
            System.out.print("Unesite jmbg "+(i+1)+". trenera? ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja "+(i+1+". trenera? "));
            int godina = s.nextInt();
            System.out.print("Unesite godine iskustva "+(i+1)+". trenera? ");
            int iskustvo = s.nextInt();
            System.out.print("Unesite tip "+(i+1)+". trenera? ");
            String tip = s.next();
            treneri.add(new Trener(ime+" "+prezime, jmbg, godina, iskustvo, tip));
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
            System.out.println();
        }
    }

}
