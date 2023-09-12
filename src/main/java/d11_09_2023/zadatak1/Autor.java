package d11_09_2023.zadatak1;

public class Autor {
    /*
    1.	Kreirati klasu Autor koja ima
    -ime i prezime
    -konstuktore koje mislite da su vam potrebni
    -gettere i settere za atribute
    -metodu print koja stampa u formatu:
    (ime autora) (prezime autora)
     */
    private String ime;
    private String prezime;
    public Autor(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){return this.ime;}

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getPrezime(){return this.prezime;}


    public void print(){
        System.out.println(this.ime + " " + this.prezime);
    }

}
