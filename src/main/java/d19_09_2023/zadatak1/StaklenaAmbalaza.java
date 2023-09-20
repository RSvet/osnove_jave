package d19_09_2023.zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
    /*
    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
-	kaucija za flasu
-	atribut koji kaze da li se za flasu placa kaucija
-	osnovna cena
-	gettere i setter za atribute
-	konstuktori koji su vam potrebni
-	racuna cenu
-	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
-	ako se ne placa, (osnovna cena) * 1.2
-	metoda stampaj stampa sve podatke iz klase staklena flasa.
     */

    private int kaucija;
    private boolean placaKauciju;
    private double osnovnaCena;


    public StaklenaAmbalaza(String barkod, String naziv, int tezinaNeto, int tezinaBruto, int kaucija, boolean placaKauciju, double osnovnaCena) {
        super(barkod, naziv, tezinaNeto, tezinaBruto);
        this.kaucija = kaucija;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public void setPlacaKauciju(boolean placaKauciju) {
        this.placaKauciju = placaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = this.osnovnaCena * 1.2;

        if(this.placaKauciju)
         cena+=this.kaucija;

        return cena;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: "+this.barkod+", naziv: "+this.naziv+", tezina: "+this.tezina()+"g.");
        System.out.println("Za proizvod se "+((this.placaKauciju)?"placa kaucija u iznosu "+this.kaucija+" din.":"ne placa kaucija."));
        System.out.println("Cena je "+this.cena()+" din.");
        System.out.println();
    }
}
