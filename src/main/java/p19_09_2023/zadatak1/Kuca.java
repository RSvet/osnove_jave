package p19_09_2023.zadatak1;

public class Kuca extends Objekat{

    private int clanovi;

    public Kuca(String adresa, double povrsina, int zona, int clanovi) {
        super(adresa, povrsina, zona);
        this.clanovi = clanovi;
    }

    public int getClanovi() {
        return clanovi;
    }

    public void setClanovi(int clanovi) {
        this.clanovi = clanovi;
    }

    @Override
    public double porez() {
        return koeficijent()*this.povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println(this.adresa+", povrsina: "+this.povrsina+", zona: "+this.zona);
        System.out.println("Broj clanova: "+this.clanovi);
        System.out.println("Porez: "+this.porez()+" din.");
    }
}
