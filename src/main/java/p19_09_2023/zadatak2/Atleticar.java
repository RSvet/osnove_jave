package p19_09_2023.zadatak2;

public abstract class Atleticar {

    private String imePrezime;
    protected int rezultat;

    public Atleticar(String imePrezime, int rezultat) {
        this.imePrezime = imePrezime;
        this.rezultat = rezultat;
   }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean isBetter(Atleticar atleticar);

    public void stampaj(){
        System.out.println(this.imePrezime+", rezultat: "+this.rezultat);
    }
}
