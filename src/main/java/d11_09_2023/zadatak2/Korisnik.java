package d11_09_2023.zadatak2;

public class Korisnik {
    /*
    Kreirati klasu Korisnik koja ima
    ●	ime
    ●	prezime
    ●	gettere i settere za ime i prezime
    ●	konstuktore koje mislite da su vam potrebni
    ●	metoda koja stampa u formatu:
    (ime) (prezime)
     */
    private String ime;
    private String prezime;

    public Korisnik(){}
    public Korisnik(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme()
    {return this.ime;}

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getPrezime()
    {return this.prezime;}

    public void print(){
        if(this.ime!=null && this.prezime != null)
        System.out.println(this.ime+" "+this.prezime);
        else System.out.println("Korisnik nije kreiran");
    }
}
