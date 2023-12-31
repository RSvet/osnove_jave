package d15_09_2023.zadatak2;

public class Osoba {
    /*
    Kreirati klasu Osoba koja ima:
-	ime i prezime
-	jmbg
-	godinu rodjenja
-	default-ni konstuktor
-	konstuktor sa parametrima
-	gettere i settere
-	metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)
     */
    protected String imePrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imePrezime, String jmbg, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj(){
        System.out.println(this.imePrezime+", JMBG: "+this.jmbg+", godiste: "+this.godinaRodjenja+".");
    }
}
