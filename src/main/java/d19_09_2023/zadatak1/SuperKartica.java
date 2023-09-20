package d19_09_2023.zadatak1;

public class SuperKartica {
    /*
    Kreirati klasu SuperKartica koja ima:
-	broj kartice
-	ime i prezime vlasnika
-	popust (200, 500, … )
-	konstuktore (default-ni i sa parametrima)
-	gettere i settere
-	metodu stampaj koja stampa karticu u formatu:
(broj kartice), (ime i prezime)
     */

    private String brojKartice;
    private String vlasnik;
    private int popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String vlasnik, int popust) {
        this.brojKartice = brojKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println("Placeno karticom: ");
        System.out.println("Broj: "+this.brojKartice+", na ime "+this.vlasnik+".");
        System.out.println();
    }
}
