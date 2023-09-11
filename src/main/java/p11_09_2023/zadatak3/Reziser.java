package p11_09_2023.zadatak3;

public class Reziser {
    /*
    Kreirati klasu Reziser koja ima:
    ime i prezime rezisera
    starost
    konstruktore, gettere i settere koji su potrebni
    metodu print koja stampa podatke u formatu
    ime prezime, starost.god
     */

    private String ime;
    private String prezime;
    private int starost;

    private Film film;

    public Reziser(String ime, String prezime, int starost){
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }

    public Reziser(String ime, String prezime, int starost, Film film){
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
        this.film = film;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getPrezime(){
        return this.prezime;
    }

    public void setStarost(int starost){
        this.starost = starost;
    }
    public int getStarost(){
        return this.starost;
    }

    public void setFilm(Film film){this.film = film;}
    public Film getFilm(){return this.film;}

    public void print(){
        if(this.film!= null){
//            System.out.println("Reziser: "+this.ime+" "+this.prezime+", starost: "+this.starost);
//            System.out.println("Rezirao je film: "+this.film.getNaziv()+", godine: "+this.film.getGodina());
            this.film.stampa();
        }


    }

}
