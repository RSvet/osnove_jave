package p19_09_2023.zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("skok u dalj", "Skakacka");

        Disciplina trka = new Disciplina("110m s preponama", "Trkacka");


        skok.dodajAtleticara(new Skakac("Milan Maric", 7));
        skok.dodajAtleticara(new Skakac("Milos Simic", 5));
        skok.dodajAtleticara(new Skakac("Marko Tasic", 10));

        trka.dodajAtleticara(new Trkac("Srdjan Ilic", 350));
        trka.dodajAtleticara(new Trkac("Petar Petrovic", 120));


        skok.pobednik();
        trka.pobednik();
    }
}
