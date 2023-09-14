package p14_09_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Reziser milan = new Reziser("Milan Jovanovic");

        Film film1 = new Film("Film 1", 2020);
        Film film2 = new Film("Film 2", 2023);
        Film film3= new Film("Film 3", 2024);

        milan.dodajFilm(film1);
        milan.dodajFilm(film2);
        milan.dodajFilm(film3);
        milan.stampaj();
    }
}
