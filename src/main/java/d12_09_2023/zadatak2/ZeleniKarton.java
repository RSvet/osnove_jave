package d12_09_2023.zadatak2;

public class ZeleniKarton {
    /*
    Kreirati klasu ZeleniKarton koja ima:
●	ime i prezime studenta
●	broj indeksa
●	naziv predmeta
●	ime i prezime profesora
●	ocenu - od 5 do 10
●	gettere i settere
●	konstruktore
●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
●	metodu stampaj koja stampa podatke u formatu:
		(naziv predmeta) - (ocena)
		Student: ime i prezime, broj indeksa
		Profesor: ime i prezime

     */

    private String imePrezime;
    private int brojIndeksa;
    private String predmet;
    private String profesor;
    private int ocena;
    public ZeleniKarton(String imePrezime, int brojIndeksa, String predmet, String profesor, int ocena){
        this.imePrezime = imePrezime;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }
    public void setImePrezime(String imePrezime){
        this.imePrezime = imePrezime;
    }
    public String getImePrezime(){
        return this.imePrezime;
    }
    public void setBrojIndeksa(int brojIndeksa){
        this.brojIndeksa = brojIndeksa;
    }
    public int getBrojIndeksa(){
        return this.brojIndeksa;
    }
    public void setPredmet(String predmet){
        this.predmet = predmet;
    }
    public String getPredmet(){
        return this.predmet;
    }

    public void setProfesor(String profesor){
        this.profesor = profesor;
    }
    public String getProfesor(){
        return this.profesor;
    }

    public void setOcena(int ocena){
        this.ocena = ocena;
    }
    public int getOcena(){
        return this.ocena;
    }

    public boolean polozen(){
      return this.ocena>5;
    }
    public void stampaj(){
        System.out.println("("+this.predmet+ ") - ("+this.ocena+")");
        System.out.println("Student: "+this.imePrezime+", "+this.brojIndeksa);
        System.out.println("Profesor: "+this.profesor);
    }
}
