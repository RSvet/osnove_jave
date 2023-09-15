package p15_09_2023;

public class Vozilo {
    protected String registracija;
    protected String marka;
    protected int brzina;

    public Vozilo() {
    }

    public Vozilo(String registracija, String marka, int brzina) {
        this.registracija = registracija;
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void dodajGas(){
        this.brzina+=10;
    }
    public void koci(){
        this.brzina-=10;
    }
    public void stampaj(){
        System.out.println("Registracija: "+this.registracija);
        System.out.println("Brzina: "+this.brzina);
        System.out.println("Marka: "+this.marka);
    }




}
