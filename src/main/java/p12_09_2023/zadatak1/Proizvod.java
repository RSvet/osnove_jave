package p12_09_2023.zadatak1;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;
    public Proizvod(String naziv, Kupac kupac, double cena){
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cena;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public String getNaziv(){
        return this.naziv;
    }

    public void setKupac(Kupac kupac){
        this.kupac = kupac;
    }
    public Kupac getKupac(){
        return this.kupac;
    }

    public void setCenaIzrade(double cena){
        this.cenaIzrade = cena;
    }
    public double getCenaIzrade(){
        return this.cenaIzrade;
    }

    public double cenaProizvoda(){
        if(this.kupac.getClanskaKarta() != null){
            return this.cenaIzrade * 1.9*(100-this.kupac.getClanskaKarta().getPopust())/100;
        }
        else return this.cenaIzrade*1.9;

    }

    public void stampa(){
        System.out.println(this.naziv+" - "+this.cenaProizvoda());
        if(this.kupac != null)
        this.kupac.stampaj();
    }
}
