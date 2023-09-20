package d19_09_2023.zadatak2;
import java.util.ArrayList;
import java.util.List;
public class PlaninarskiDom {
    /*
    Kreirati klasu PlaninarskiDom koja ima privatne atribute:
●	naziv doma
●	godinu kada je osnovan.
●	članove doma koji su planinari (klasa vodi računa o nizu)
Dok od javnih:
●	default-ni konstuktor i konstuktor koji postavlja sve parametre
●	gettere i settere koji su potrebni
●	metodu učlani planinara, koja dodaje planinara u niz
●	metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
●	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
●	metodu koja štampa podatke o domu i o svim članovima doma
●	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
     */

    private String naziv;
    private int godina;
    private List<Planinar>clanovi;

    public PlaninarskiDom() {
        this.clanovi = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
        this.clanovi = new ArrayList<>();
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

    public void uclani(Planinar p){
        this.clanovi.add(p);
    }

    public int uspesnoPopeli(Planina p){
        int counter=0;
        for (Planinar planinar : clanovi) {
            if (planinar.uspesanUspon(p)) {
                counter++;
            }
        }
        return counter;
    }

    public void izbaci(int broj){
        for (int i = 0; i < clanovi.size(); i++) {
            if(clanovi.get(i).id==broj)
                clanovi.remove(clanovi.get(i));
        }
    }

    public void stampaj(){
        System.out.println("Planinarski dom "+this.naziv+", osnovan "+this.godina+" godine.");
        System.out.println("Clanovi: ");
        for (Planinar planinar : clanovi) {
            planinar.stampaj();
        }
        System.out.println("Mesecni prihod "+this.mesecniPrihod()+" din.");
        System.out.println();
    }

    public int mesecniPrihod(){
        int clanarina=0;
        for (int i = 0; i < clanovi.size(); i++) {
            clanarina+=clanovi.get(i).clanarina();
        }
        return clanarina;
    }
}
