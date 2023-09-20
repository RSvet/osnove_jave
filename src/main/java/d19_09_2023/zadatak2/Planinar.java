package d19_09_2023.zadatak2;

public abstract class Planinar {
    /*
    Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
●	jedinstveni celobrojni identifikacioni broj
●	ime i prezime
Dok od javnih metoda:
●	konstruktor koji postavlja sve atribute klase.
●	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
●	apstraktnu metodu štampaj
●	apstraktnu metodu koja vraca clanarinu planinara
●	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.

     */
    protected int id;
    protected String ime;

    public Planinar(int id, String ime) {
        this.id = id;
        this.ime = ime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public abstract void stampaj();
    public abstract int clanarina();
    public abstract boolean uspesanUspon(Planina pl);
}
