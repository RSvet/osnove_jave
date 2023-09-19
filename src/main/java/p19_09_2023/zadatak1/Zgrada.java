package p19_09_2023.zadatak1;

public class Zgrada extends Objekat {
    private int stanovi;

    public Zgrada(String adresa, double povrsina, int zona, int stanovi) {
        super(adresa, povrsina, zona);
        this.stanovi = stanovi;
    }

    public int getStanovi() {
        return stanovi;
    }

    public void setStanovi(int stanovi) {
        this.stanovi = stanovi;
    }


    @Override
    public double porez() {
        return this.koeficijent()*this.povrsina*this.stanovi;
    }

    @Override
    public void stampaj() {
        System.out.println(this.adresa+", povrsina: "+this.povrsina+", zona: "+this.zona);
        System.out.println("Broj stanova: "+this.stanovi);
        System.out.println("Porez: "+this.porez()+" din.");

    }
}
