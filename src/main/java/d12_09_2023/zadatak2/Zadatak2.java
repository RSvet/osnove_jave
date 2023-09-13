package d12_09_2023.zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
    /*
    ●	kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
    ●	Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
     */
        ZeleniKarton karton1 =new ZeleniKarton("Pera Peric", 123, "Matematika", "Dragan Simovic", 5);
        ZeleniKarton karton2 =new ZeleniKarton("Dragana Tasic", 456, "Biologija", "Tijana Markovic", 9);
        ZeleniKarton karton3 =new ZeleniKarton("Marko Ristic", 678, "Hemija", "Milic Maksimovic", 5);
        ZeleniKarton karton4 =new ZeleniKarton("Tijana Tasic", 789, "Makroekonomija", "Janko Petrovic", 9);
        ZeleniKarton karton5 =new ZeleniKarton("Nemanja Kostic", 891, "Informatika", "Marko Josic", 8);

        ArrayList<ZeleniKarton>kartoni = new ArrayList<>();
        kartoni.add(karton1);
        kartoni.add(karton2);
        kartoni.add(karton3);
        kartoni.add(karton4);
        kartoni.add(karton5);

        for (int i = 0; i < kartoni.size(); i++) {
            kartoni.get(i).stampaj();
            System.out.println();
        }

        int suma =0;
        for (int i = 0; i < kartoni.size(); i++) {
            suma+=kartoni.get(i).getOcena();
        }
        double prosek = suma*1.0/kartoni.size();
        System.out.println("Prosecna ocena je: "+prosek);

        /*
            ○	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite
         */

        int sumaPolozenih =  0;
        int brojac=0;
        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).polozen()){
                sumaPolozenih+=kartoni.get(i).getOcena();
                brojac++;
            }
        }
        double prosekPolozenih = sumaPolozenih*1.0/brojac;
        System.out.println("Prosek polozenih ispita: "+prosekPolozenih);


    }
}
