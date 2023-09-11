package p11_09_2023.zadatak4;

public class Film {
    private String naziv;
    private int godina;

    private Reziser rezirao;
    public Film(String naziv, int godina){
        this.naziv = naziv;
        this.godina = godina;
    }

    public Film(String naziv, int godina, Reziser rezirao){
        this.naziv = naziv;
        this.godina = godina;
        this.rezirao = rezirao;
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
        System.out.println("Reziser: "+this.rezirao.getIme()+" "+this.rezirao.getPrezime());
    }
}
