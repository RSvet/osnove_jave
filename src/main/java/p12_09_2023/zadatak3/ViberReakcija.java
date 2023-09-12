package p12_09_2023.zadatak3;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik korisnik;

    public ViberReakcija(String emoji, ViberKorisnik korisnik){
        this.emoji = emoji;
        this.korisnik = korisnik;
    }

    public String getEmoji(){
        return this.emoji;
    }
    public ViberKorisnik getKorisnik(){
        return this.korisnik;
    }
}
