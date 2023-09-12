package p12_09_2023.zadatak4;

public class Sastojak {
    private String naziv;
    private double cena;
    public Sastojak(String naziv, double cena){
        this.naziv = naziv;
        this.cena = cena;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public String getNaziv(){
        return this.naziv;
    }

    public void setCena(double cena){
        this.cena = cena;
    }
    public double getCena(){
        return this.cena;
    }
}
