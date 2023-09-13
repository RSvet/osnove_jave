package d12_09_2023.zadatak3;

public class Racun {
    /*
    Kreirati klasu Racun koja ima:
    ●	broj racuna (npr: 170-289328923-23)
    ●	ime i prezime osobe
    ●	trenutno stanje na racunu (npr: 100, 1220)
    ●	gettere i setter za sve atribute, sem settera za stanje na racunu
    ●	metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
    ●	metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
    ●	metodu koja stampa podatke o racunu u formatu:
    Ime i prezime  -  broj racuna
    stanje na racunu je (trenutno stanje) rsd.
     */

    private String broj;
    private String vlasnik;
    private double stanje;

        public Racun(String broj, String vlasnik, double stanje){
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.stanje = stanje;
    }
    public void setBroj(String broj){
        this.broj = broj;
    }
    public String getBroj(){
        return this.broj;
    }
    public void setVlasnik(String vlasnik){
        this.vlasnik = vlasnik;
    }
    public String getVlasnik(){
        return this.vlasnik;
    }
    public double getStanje(){
        return this.stanje;
    }
    public void uplatiNaRacun(double iznos){
        this.stanje +=iznos;
    }
    public void skiniSaRacuna(double iznos){
        if(this.stanje>=iznos)
            this.stanje-=iznos;
        else System.out.println("Nemate dovoljno sredstava za transakciju!");
    }
    public void stampaj(){
        System.out.println(this.vlasnik+" - "+this.broj);
        System.out.println("Stanje na racunu je "+this.stanje+" rsd.");
    }
}
