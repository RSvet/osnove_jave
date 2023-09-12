package p12_09_2023.zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak>sastojci = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Broj sastojaka: ");
        int brojSastojaka = s.nextInt();

        for (int i = 0; i < brojSastojaka; i++) {
            System.out.println("Naziv "+(i+1)+". sastojka? ");
            String sastojak = s.next();
            System.out.println("Cena "+(i+1)+". sastojka? ");
            double cena = s.nextDouble();
            sastojci.add(new Sastojak(sastojak, cena));
        }

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println("Sastojak: "+sastojci.get(i).getNaziv());
            System.out.println("Cena: "+sastojci.get(i).getCena());
        }


    }
}
