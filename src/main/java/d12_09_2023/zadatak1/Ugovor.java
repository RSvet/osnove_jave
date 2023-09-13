package d12_09_2023.zadatak1;

import java.sql.SQLOutput;

public class Ugovor {
    /*
    Kreirati klasu Ugovor koja ima:
●	godinu, dan i mesec sklapanja ugovora
●	osobu koja prodaje nekretninu (fizicko lice)
●	osobu koja kupuje nekretninu (fizicko lice)
●	cenu za koju se prodaje nekretnina
●	adresu nekretnine (ulica br., grad)
●	metodu koja vraca procenat zarade
○	za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
●	metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
1000 + cena za koju se prodaje * procenat zarade
●	metodu koja stampa ugovor u formatu:
Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca)
i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u
obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
     */

    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa){
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa= adresa;
    }
    public void setDatum(String datum){
        this.datum = datum;
    }
    public String getDatum(){
        return this.datum;
    }
    public void setProdavac(FizickoLice prodavac){
        this.prodavac = prodavac;
    }
    public FizickoLice getProdavac(){
        return this.prodavac;
    }

    public void setKupac(FizickoLice kupac){
        this.kupac = kupac;
    }
    public FizickoLice getKupac(){
        return this.kupac;
    }

    public void setCena(int cena){
        this.cena = cena;
    }

    public int getCena(){
        return this.cena;
    }

    public void setAdresa(String adresa){
        this.adresa = adresa;
    }
    public String getAdresa(){
        return this.adresa;
    }
    public double procenatZarade(){
        if(kupac.getPrethodniKupac())
            return 0.02;
        else return 0.03;
    }
    public double zarada(){
        return 1000 + this.cena*this.procenatZarade();
    }
    public void stampaj(){
        System.out.print("Dana ("+this.datum+") god, sklopljen je ugovor izmedju (");
        this.prodavac.stampaj();
        System.out.print(") i (");
        this.kupac.stampaj();
        System.out.println(") o kupovini nekretnine ("+this.adresa+") po ceni od ("+this.cena+
        ") €, pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od ("+this.zarada()+") €"
        );
    }


}
