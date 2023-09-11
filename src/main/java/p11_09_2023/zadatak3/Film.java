package p11_09_2023.zadatak3;

public class Film {
    /*
    Kreirati klasu Film koja ima:
        naziv filma
        iz koje godine je film
        konstruktore, gettere i settere
        metodu print koja stampa podatke u formatu
        naziv filma, godina
     */

    private String naziv;
    private int godina;
    public Film(String naziv, int godina){
        this.naziv = naziv;
        this.godina = godina;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public String getNaziv(){
        return this.naziv;
    }

    public void setGodina(int godina){
        this.godina = godina;
    }
    public int getGodina(){
        return this.godina;
    }

    public void stampa(){
        System.out.println("Film: "+this.naziv+", godina: "+this.godina);
    }



}
