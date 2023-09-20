package d19_09_2023.zadatak2;

public class Alpinista extends Planinar {
    /*
    Kreirati klasu Alpinista koja nasleđuje klasu Planinar.
    Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati.
    Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
    a informacije o alpinisti se ispisuju u formatu:
    Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
     */

    private int poeni;

    public Alpinista(int id, String ime, int poeni) {
        super(id, ime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public int clanarina() {
        return 1500-this.poeni*50;
    }

    @Override
    public boolean uspesanUspon(Planina pl) {
        return pl.getVisina()<=4000;
    }

    @Override
    public void stampaj() {

        System.out.println("Alpinista, id: "+this.id);
        System.out.println("Ime: "+this.ime);
        System.out.println("Broj poena: "+this.poeni+".");
        System.out.println();

    }
}
