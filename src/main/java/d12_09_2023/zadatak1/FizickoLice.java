package d12_09_2023.zadatak1;

public class FizickoLice {
    /*
    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
    ●	ime i prezime
    ●	broj licne karte
    ●	jmbg
    ●	podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
    ●	konstuktore
    ●	gettere i settere, jmbg ne sme da se menja
    ●	metodu stampaj, koja stmpa podatke u formatu:
    ime i prezime, broj licne karte
     */
    private String imePrezime;
    private String brojLk;
    private String jbmg;
    private boolean prethodniKupac;

    public FizickoLice(String imePrezime, String brojLk, String jmbg, boolean prethodniKupac){
        this.imePrezime = imePrezime;
        this.brojLk = brojLk;
        this.jbmg = jmbg;
        this.prethodniKupac = prethodniKupac;
    }

    public void setImePrezime(String imePrezime){
        this.imePrezime = imePrezime;
    }
    public String getImePrezime(){
        return this.imePrezime;
    }

    public void setBrojLk(String brojLk){
        this.brojLk = brojLk;
    }
    public String getBrojLk(){
        return this.brojLk;
    }
    public String getJbmg(){
        return this.jbmg;
    }
    public void setPrethodniKupac(boolean prethodniKupac){
        this.prethodniKupac = prethodniKupac;
    }
    public boolean getPrethodniKupac(){
        return this.prethodniKupac;
    }

    public void stampaj(){
        System.out.print(this.imePrezime+", broj Lk: "+this.brojLk);
    }
}
