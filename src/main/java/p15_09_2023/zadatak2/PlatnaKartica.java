package p15_09_2023.zadatak2;

public class PlatnaKartica {
    protected int suma;
    protected String broj;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(int suma, String broj, int godina, int mesec) {
        this.suma = suma;
        this.broj = broj;
        this.godina = godina;
        this.mesec = mesec;
    }

    public int getSuma() {
        return suma;
    }

    public String getBroj() {
        return broj;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void dodajSredstva(int iznos){
        this.suma+=iznos;
    }

    public void izvrsiTransakciju(double iznos){
        if(this.suma>=iznos)
        this.suma-=iznos;
    }

    public void stampaj(){
        System.out.println(this.broj+", "+this.mesec+"/"+this.godina+", "+"$"+this.suma);
    }
}
