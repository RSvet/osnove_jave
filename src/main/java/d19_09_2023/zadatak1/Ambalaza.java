package d19_09_2023.zadatak1;

public abstract class Ambalaza {
/*
Kreirati abstraktnu klasu Ambalaza koja ima:
-	barkod (primer: 328232-2823)
-	naziv artikla
-	neto tezinu
-	bruto tezinu
-	konstuktore (default-ni i sa parametrima)
-	gettere i settere
-	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
-	abstraktnu metodu koja vraca cenu artikla
-	abstraktnu metodu stampaj
 */

    protected String barkod;
    protected String naziv;
    protected  int tezinaNeto;
    protected int tezinaBruto;

    public Ambalaza(){}

    public Ambalaza(String barkod, String naziv, int tezinaNeto, int tezinaBruto) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.tezinaNeto = tezinaNeto;
        this.tezinaBruto = tezinaBruto;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTezinaNeto() {
        return tezinaNeto;
    }

    public void setTezinaNeto(int tezinaNeto) {
        this.tezinaNeto = tezinaNeto;
    }

    public int getTezinaBruto() {
        return tezinaBruto;
    }

    public void setTezinaBruto(int tezinaBruto) {
        this.tezinaBruto = tezinaBruto;
    }

    public int tezina(){
        return this.tezinaBruto - this.tezinaNeto;
    }

    public abstract double cena();
    public abstract void stampaj();
}
