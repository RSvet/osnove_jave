package d14_09_2023.zadatak1;

public class Ispit {
    /*
    Napisati klasu Ispit koja ima
    ●	naziv predmeta
    ●	ocenu (u rasponu od 5 do 10)
    ●	Ime i prezime profesora koji predaje predmet
    ●	konstuktore koje mislite da ce vam trebati
    ●	gettere i settere za sve atribute
    ●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
    ●	metodu koja stampa ispit u formatu:
    (naziv predmeta) - (profesor) - (ocena)
     */
    private String naziv;
    private int ocena;
    private String profesor;

    public Ispit(String naziv, int ocena, String profesor) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozen(){
        return this.ocena > 5 && this.ocena <= 10;
    }

    public void print(){
        System.out.println("Ispit: "+this.naziv+" - Profesor: "+this.profesor+" - Ocena: "+this.ocena);
    }
}
