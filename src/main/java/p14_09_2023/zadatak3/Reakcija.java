package p14_09_2023.zadatak3;

public class Reakcija {
    private String tip;
    private String korisnik;

    public Reakcija(String tip, String korisnik) {
        this.tip = tip;
        this.korisnik = korisnik;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }
}
