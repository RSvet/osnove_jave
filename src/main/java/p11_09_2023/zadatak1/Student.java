package p11_09_2023.zadatak1;

public class Student {
    /*
    1. Zadatak
        Kreirati klasu Student koja ima:
        ime
        prezime
        broj indeksa (int)
        da li je na budzetu
        gettere i settere za sve atributge
     */

    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean budzet;

    public void setIme(String ime){
        this.ime = ime;
    }
    public String getIme(){
        return this.ime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setBrojIndeksa(int brojIndeksa){
        this.brojIndeksa = brojIndeksa;
    }
    public int getBrojIndeksa(){
        return this.brojIndeksa;
    }
    public void setBudzet(boolean budzet){
        this.budzet = budzet;
    }
    public boolean getBudzet(){
        return this.budzet;
    }

    public void stampaj(){
        String finansiranje = this.budzet ? "je na budzetu" : "nije na budzetu";
        System.out.println("Student: "+this.ime + " "+this.prezime);
        System.out.println("Br indeksa: "+this.brojIndeksa);
        System.out.println("Budzet: "+finansiranje);
    }
}
