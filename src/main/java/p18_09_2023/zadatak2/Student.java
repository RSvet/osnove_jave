package p18_09_2023.zadatak2;

public abstract class Student {
    protected String imePrezime;
    protected int brojIndeksa;
    protected int godina;

    public Student(String imePrezime, int brojIndeksa, int godina) {
        this.imePrezime = imePrezime;
        this.brojIndeksa = brojIndeksa;
        this.godina = godina;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public abstract int cena();
    public abstract boolean budzet();

    public void stampa(){
        System.out.println(this.imePrezime+", indeks br: "+this.brojIndeksa+", godina: "+this.godina);
        System.out.println("Finansiranje: "+(this.budzet()?"budzet":"samofinansirajuci."));
        System.out.println("Cena skolarine: "+this.cena());
    }
}
