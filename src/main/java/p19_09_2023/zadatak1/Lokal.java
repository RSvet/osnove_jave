package p19_09_2023.zadatak1;

public class Lokal extends Objekat {
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double porez() {
        return this.koeficijent()*this.povrsina*1.3;
    }

    @Override
    public void stampaj() {
        System.out.println(this.adresa+", povrsina: "+this.povrsina+", zona: "+this.zona);
        System.out.println("Porez: "+this.porez()+" din.");
    }


}
