package p11_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        Film movie = new Film("Awake", 2007);
        movie.stampa();
        movie.setGodina(2012);
        movie.stampa();

        System.out.println();

        Reziser director = new Reziser("Pera", "Simic", 35 );
        director.print();
        director.setIme("Marija");
        director.setFilm(movie);
        director.print();



    }
}
