package d19_09_2023.zadatak1;

public class Tetrapak extends Ambalaza{
    /*
    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
-	atribut koji kaze da li se moze reciklirati
-	osnovna cena
-	gettere i setter za atribute
-	konstuktori koji su vam potrebni
-	racuna cenu tako da ispunjava uslova:
-	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
-	ako nije u cenu ulazi samo osnovna cena
-	metoda stampaj stampa sve podatke iz klase tetrapak.
     */

    private boolean recikliraSe;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, int tezinaNeto, int tezinaBruto, boolean recikliraSe, double osnovnaCena) {
        super(barkod, naziv, tezinaNeto, tezinaBruto);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = this.osnovnaCena;
        if (this.recikliraSe)
            cena+=this.tezina()*1.5;
        return cena;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod+", naziv: "+this.naziv+", tezina: "+this.tezina()+"g.");
        System.out.println("Proizvod se "+(this.recikliraSe?"":"ne ")+"reciklira.");
        System.out.println("Cena je "+this.cena()+" din.");
        System.out.println();

    }
}
