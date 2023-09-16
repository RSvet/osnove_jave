package d15_09_2023.zadatak2;
import java.util.ArrayList;

public class Igrac extends Osoba{
    /*
    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
-	broj (broj koji igrac nosi)
-	poziciju koju igra (odbrambeni, napadac, … )
-	niz kartona
-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
-	default-ni konstuktor
-	konstuktor sa parametrima
-	gettere i settere za broj, kapiten i poziciju
-	metodu dodaj karton, gde se dodaje karton u niz
-	metodu koja vraca broj zutih kartona
-	metodu koja vraca broj crvenih kartona
-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
     */

    private int broj;
    private String pozicija;
    private ArrayList<Karton>kartoni;

    private boolean kapiten;

    public Igrac(){
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kartoni = new ArrayList<>();
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }

    public int brojZutihKartona(){
        int zuti = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).getTip().equals("zuti"))
                zuti++;
        }
        return zuti;
    }

    public int brojCrvenihKartona(){
        int crveni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).getTip().equals("crveni"))
                crveni++;
        }
        return crveni;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Igrac je sa brojem: "+this.broj+", na poziciji "+this.pozicija+".");
        System.out.println("Igrac "+(this.kapiten?"je ":"nije ")+"kapiten.");
        System.out.println("Igrac "+(this.brojZutihKartona()==0?"nema zutih kartona":"ima zutih kartona: "+this.brojZutihKartona())+".");
        System.out.println("Igrac "+(this.brojCrvenihKartona()==0?"nema crvenih kartona":"ima crvenih kartona: "+this.brojCrvenihKartona())+".");
    }
}
