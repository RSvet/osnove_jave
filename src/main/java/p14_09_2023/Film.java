package p14_09_2023;

public class Film {
    private String naziv;
    private int godina;

    public Film() {
    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public void stampaj(){
        System.out.println("Film: "+this.naziv);
        System.out.println("Godina: "+this.godina);
    }
}
