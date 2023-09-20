package d19_09_2023.zadatak2;

public class RekreativniPlaninar extends Planinar {
    /*
    Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
●	naziv okruga odakle je rekreativni planinar.
●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
    s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
●	rekreativci placaju clanarinu u iznosu od 1000 rsd
●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
     */
    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;

    public RekreativniPlaninar(int id, String ime, int tezinaOpreme, String okrug, int maxUspon) {
        super(id, ime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina pl) {
        return this.maxUspon-this.tezinaOpreme*50>=pl.getVisina();
    }

    @Override
    public void stampaj() {

        System.out.println("Rekreativac, id: "+this.id);
        System.out.println("Ime: "+this.ime);
        System.out.println("Okrug: "+this.okrug+".");
        System.out.println();
    }
}
